package observer;

import message.Message;

public interface Observer {
    boolean update(Message message);
}
