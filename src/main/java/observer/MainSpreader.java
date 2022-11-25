//package observer.spreader;
package observer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MainSpreader implements NewsSpreader {
	/** Map containing blocked words, with the option to replace with # if value is true */
	Map<String, Boolean> blockedWords;
	/** Map containing NewsSource names with passwords as hashed values */
	Map<String, String> trustedSources;
	/** Set containing all NewsReceivers to be broadcasted to */
	Set<NewsReceiver> receiver;


	// Default constructor must be present, you may add implementation if needed
	public MainSpreader(){
		blockedWords = new LinkedHashMap<String, Boolean>();
		trustedSources = new LinkedHashMap<String, String>();
		receiver = new LinkedHashSet<NewsReceiver>();
	}
	
	
	@Override
	public boolean registerTrustedSource(String source, String pwd){
		if(source == null || pwd == null || pwd == "")
			return false;

		return trustedSources.put(source, getPasswordHash(pwd)) == null;
	}
	

	@Override
	public String spreadNews(String news, String source, String pwd) throws NewsSpreaderException {	
		if(trustedSources.get(source) == null)
			throw new UntrustedSourceException(source);

		if(trustedSources.get(source).equals(getPasswordHash(pwd)) == false)
			throw new AuthenticationException(source);

		Topic topic = getTopicFromMessage(news);
		news = censorBlockedWords(news, source);
		
		//Broadcast message to all receiver
		BCMessage bcmessage = new BCMessage(news, source, LocalDateTime.now(), topic);
		receiver.forEach((r) -> {
			if(r.getTopics().contains(topic))
				r.receiveNews(this, bcmessage);
		});

		return bcmessage.toString();
	}


	@Override
	public boolean blockWord(String contents, boolean redact) {
		if(contents == null || contents == "")
			return false;

		return blockedWords.put(contents, redact) != null;
	}


	@Override
	public boolean unblockWord(String contents) {
		if(contents == null || contents == "")
			return false;

		return blockedWords.remove(contents) != null;
	}


	@Override
	public boolean registerNewsReceiver(NewsReceiver newsReceiver) {
		return newsReceiver == null ? false : receiver.add(newsReceiver);
	}


	@Override
	public boolean unregisterNewsReceiver(NewsReceiver newsReceiver) {
		return newsReceiver == null ? false : receiver.remove(newsReceiver);
	}



	//--------private helper methods
	//-------------------------------------------------------------
	/** returns the MD5 hash of the password */
	private String getPasswordHash(String password){
		String generatedPassword = null;

		try 
		{
		// Create MessageDigest instance for MD5
		MessageDigest md = MessageDigest.getInstance("MD5");

		// Add password bytes to digest
		md.update(password.getBytes());

		// Get the hash's bytes
		byte[] bytes = md.digest();

		// This bytes[] has bytes in decimal format. Convert it to hexadecimal format
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		// Get complete hashed password in hex format
		generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return generatedPassword;
	}


	/** returns the topic contained in the message, if exists */
	private Topic getTopicFromMessage(String message){
		//Topic should be at the end proceeded by a hashtag
		Topic topic = Topic.Other;

		String[] tmp = message.split("#");
		
		if(tmp.length == 2){
			//found exactly 1 topic
			String topic_s = tmp[1];
			topic_s = topic_s.replace("#", "");

			try{
				topic = Topic.valueOf(topic_s);
			}
			catch(Exception e){
				//Parse exeption, Illegal Argument
				topic = Topic.Other;
			}
		}

		return topic;
	}


	/** replaced blocked words in message or throws an Exception if needed */
	private String censorBlockedWords(String message, String source) throws NewsSpreaderException{
		for(String word : blockedWords.keySet()){
			word = word.toLowerCase();

			if(message.contains(word)){
				//found word to censor

				if(blockedWords.get(word).equals(false)){
					//no censoring, but not sending message at all
					throw new BlockedContentException(source);
				}
	
				//censoring with hashtag
				message = message.replace("(?i)" + word, "#");
			}
		}

		return message;
	}
}
