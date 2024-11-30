package memento;

public class DocumentMemento {
    private final String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }
}
