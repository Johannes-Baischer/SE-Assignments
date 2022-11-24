package observer;

import observer.message.Topic;
import observer.receiver.NewsReceiver;
import observer.receiver.NewsReceiverCommandLine;
import observer.receiver.NewsReceiverFile;
import observer.source.RandomNewsSource;
import observer.spreader.MainSpreader;
import observer.spreader.NewsSpreader;

public class Main {
    public static void main(String[] args) {
        RandomNewsSource krone = new RandomNewsSource("Krone", "1234");
        NewsSpreader broadcaster = new MainSpreader();

        krone.registerInNewsSpreader(broadcaster);
        krone.sendNews(krone.generateMessage());

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
    }
}
