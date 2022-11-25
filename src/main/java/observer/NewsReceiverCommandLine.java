//package observer.receiver;
package observer;

public class NewsReceiverCommandLine extends NewsReceiver {
    @Override
    public void receiveNews(Object sender, BCMessage bcmessage) {
        System.out.println(bcmessage.toString());
    }
    
}
