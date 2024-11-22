package observer.impl;

import observer.Observer;
import org.junit.Test;
import util.MessageRepository;

import static org.junit.Assert.*;

public class EmailObserverTest {
    private final Observer observer = new EmailObserver();

    @Test
    public void update() {
        assertTrue(observer.update(MessageRepository.EMAIL_MESSAGE));
        assertFalse(observer.update(MessageRepository.CONSOLE_MESSAGE));
    }
}