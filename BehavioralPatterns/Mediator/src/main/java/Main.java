import client.impl.Participant;
import server.Mediator;
import server.impl.ChatRoom;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatRoom();
        Participant participant0 = new Participant("0", mediator);
        Participant participant1 = new Participant("1", mediator);
        Participant participant2 = new Participant("2", mediator);

        participant1.send("hi all");
        participant2.send("nice to see you");
        participant0.send("how are you folks?");
    }
}