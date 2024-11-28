package client.impl;

import client.Client;
import server.Mediator;

import java.util.Objects;

public class Participant implements Client {
    private final String name;
    private final Mediator mediator;
    private final int id;
    private static int participantCount;

    public Participant(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.id = participantCount++;
        this.mediator.register(this);
    }

    @Override
    public void send(String message) {
        System.out.printf("Participant %s (ID %d) sending: %s\n", this.name, this.id, message);
        this.mediator.sendMessageForClient(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.printf("Participant %s (ID %d) received: %s\n", this.name, this.id, message);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
