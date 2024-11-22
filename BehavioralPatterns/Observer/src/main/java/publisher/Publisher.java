package publisher;

import message.Message;
import observer.Observer;

public interface Publisher {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(Message message);
}
