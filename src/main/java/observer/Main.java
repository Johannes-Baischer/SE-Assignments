package observer;

public class Main {
    public static void main(String[] args) {
        NewsSpreader broadcaster = new MainSpreader();
        RandomNewsSource krone = new RandomNewsSource("Krone", "1234");
        

        krone.registerInNewsSpreader(broadcaster);
        krone.sendNews(krone.generateMessage());
        //no messages received yet, because there are no receiver subscribed

        NewsReceiver fileReceiver = new NewsReceiverFile();
        NewsReceiver cmdReceiver = new NewsReceiverCommandLine();
        fileReceiver.subscribeToBroadcast(broadcaster);
        cmdReceiver.subscribeToBroadcast(broadcaster);
        fileReceiver.addTopic(Topic.Sport);
        cmdReceiver.addTopic(Topic.Politics);
        cmdReceiver.addTopic(Topic.Sport);
        cmdReceiver.addTopic(Topic.Other);

        krone.sendNews(krone.generateMessage());
        krone.sendNews(krone.generateMessage());

        broadcaster.blockWord("Bad", false);
        broadcaster.blockWord("bomb", true);

        krone.sendNews(krone.generateMessage());
        krone.sendNews(krone.generateMessage());


        cmdReceiver.addTopic(null);
        krone.sendNews(null);

        cmdReceiver.subscribeToBroadcast(null);

        krone.sendNews(krone.generateMessage());
        krone.sendNews("A bombshell new piece of news regarding apple pie.");
    }
}
