package observer.source;

import java.util.Random;

import observer.message.Topic;

public class RandomNewsSource extends NewsSource {
    public RandomNewsSource(String name, String password) {
        super(name, password);
    }

    /**
     * Generated a random message for a random topic
     * @return Generated message
     */
    public String generateMessage(){
        final int MESSAGEWORDCOUNT = 10;

        Topic topic = Topic.values()[new Random().nextInt(Topic.values().length)];
        String[] news;
        
        switch(topic){
            case Sport:
                news = new String[]{
                    "Sport ", "Car ", "Football ", "Baseball "
                };
                break;

            case Politics:
                news = new String[]{
                    "Democracy ", "World ", "Climate ", "Current "
                };
                break;

            case Other:
                news = new String[]{
                    "Cats ", "Dogs ", "Kids ", "Fun "
                };
                break;

            default:
                news = new String[]{};
                break;
        }

        String message = "";
        Random random = new Random();
        for(int i = 0; i < MESSAGEWORDCOUNT; i++){
            message += news[random.nextInt(news.length)];
        }
        message += "#" + topic.toString();

        return message;
    }
}
