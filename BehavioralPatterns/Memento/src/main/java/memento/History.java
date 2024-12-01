package memento;

import java.util.Stack;

public class History {
    private final Stack<DocumentMemento> mementos;

    public History() {
        this.mementos = new Stack<>();
    }

    public void addMemento(DocumentMemento memento) {
        this.mementos.push(memento);
    }

    public DocumentMemento getLastMemento() {
        return this.mementos.pop();
    }
}
