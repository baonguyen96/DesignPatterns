package message;

import java.util.Objects;

public class Message {
    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + getMessage() + '\'' +
                '}';
    }
}
