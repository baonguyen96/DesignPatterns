package observer.impl;

import observer.Observer;
import org.junit.Test;
import util.MessageRepository;

import static org.junit.Assert.*;

public class ConsoleObserverTest {
    private final Observer observer = new ConsoleObserver();

    @Test
    public void update() {
        assertTrue(observer.update(MessageRepository.CONSOLE_MESSAGE));
        assertFalse(observer.update(MessageRepository.EMAIL_MESSAGE));
    }
}