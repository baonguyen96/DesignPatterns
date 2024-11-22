package publisher.impl;

import message.Message;
import observer.Observer;
import observer.impl.ConsoleObserver;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import publisher.Publisher;
import util.MessageRepository;

public class MessagePublisherTest {
    private Publisher publisher;
    private Observer observer1;
    private Observer observer2;
    private Observer observer3;
    private Message message;

    @Before
    public void setUp() {
        publisher = new MessagePublisher();

        observer1 = new ConsoleObserver();
        observer2 = new ConsoleObserver();
        observer3 = new ConsoleObserver();

        message = MessageRepository.CONSOLE_MESSAGE;
    }

    @Test
    public void testNotify() {
        Observer spyObserver1 = Mockito.spy(observer1);
        Observer spyObserver2 = Mockito.spy(observer2);
        Observer spyObserver3 = Mockito.spy(observer3);

        publisher.attach(spyObserver1);
        publisher.attach(spyObserver2);
        publisher.attach(spyObserver3);

        publisher.detach(spyObserver1);

        publisher.notify(message);

        Mockito.verify(spyObserver1, Mockito.times(0)).update(message);
        Mockito.verify(spyObserver2, Mockito.times(1)).update(message);
        Mockito.verify(spyObserver3, Mockito.times(1)).update(message);
    }
}