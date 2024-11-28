package server.impl;

import client.Client;
import client.impl.Participant;
import org.junit.Test;
import org.mockito.Mockito;
import server.Mediator;

public class ChatRoomTest {
    @Test
    public void sendMessageForClient() {
        Mediator mediator = new ChatRoom();
        Client client1 = new Participant("1", mediator);
        Client client2 = new Participant("2", mediator);
        Client spyClient2 = Mockito.spy(client2);
        mediator.register(spyClient2);

        client1.send("message");
        Mockito.verify(spyClient2).notify("message");
    }
}