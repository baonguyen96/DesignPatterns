package server.impl;

import client.Client;
import server.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private final List<Client> clients;

    public ChatRoom() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void register(Client client) {
        this.clients.add(client);
    }

    @Override
    public void sendMessageForClient(String message, Client client) {
        this.clients.stream().filter(c -> !c.equals(client)).forEach(c -> c.notify(message));
    }
}
