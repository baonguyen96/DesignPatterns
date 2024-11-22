import message.Message;
import observer.Observer;
import observer.impl.ConsoleObserver;
import observer.impl.EmailObserver;
import publisher.Publisher;
import publisher.impl.MessagePublisher;

public class Main {
    public static void main(String[] args) {
        Observer emailObserver = new EmailObserver();
        Observer consoleObserver = new ConsoleObserver();
        Publisher publisher = new MessagePublisher();

        publisher.attach(emailObserver);
        publisher.attach(consoleObserver);
        publisher.notify(new Message("This message is for Email"));
        publisher.notify(new Message("This message is for Console"));

        publisher.detach(emailObserver);
        publisher.notify(new Message("This message is for Email"));
        publisher.notify(new Message("This message is for Console"));
    }
}