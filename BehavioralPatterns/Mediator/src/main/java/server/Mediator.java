package server;

import client.Client;

public interface Mediator {
    void register(Client client);
    void sendMessageForClient(String message, Client client);
}
