package observer;
/**
*  TODO: Complete the implementation. Do not change class name and existing method signatures. You may add base class and other interfaces. Make sure that the class works with the default constructor.
* 
*/
public class MainSpreader implements NewsSpreader {

	// Default constructor must be present, you may add implementation if needed
	public MainSpreader(){
	
	}
	
	@Override
	public boolean registerTrustedSource(String source, String pwd){
		return false;
	}
	
	@Override
	public String spreadNews(String news, String source, String pwd) throws NewsSpreaderException {		
		return null;
	}

	@Override
	public boolean blockWord(String contents, boolean redact) {
		return false;
	}

	@Override
	public boolean unblockWord(String contents) {
		return false;
	}
}
