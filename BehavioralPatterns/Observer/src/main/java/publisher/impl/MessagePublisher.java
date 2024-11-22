package publisher.impl;

import message.Message;
import observer.Observer;
import publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {
    private final List<Observer> observers;

    public MessagePublisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(Message message) {
        observers.forEach(observer -> observer.update(message));
    }
}
