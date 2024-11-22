package observer.impl;

import message.Message;
import observer.Observer;

public class EmailObserver implements Observer {
    @Override
    public boolean update(Message message) {
        if (message.getMessage().toLowerCase().contains("email")) {
            System.out.println(this.getClass().getSimpleName() + " observed " + message);
            return true;
        }

        return false;
    }
}
