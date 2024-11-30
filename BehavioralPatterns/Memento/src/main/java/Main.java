import memento.*;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        System.out.println(document.getContent());

        document.write("Additional content\n");
        history.addMemento(document.createMemento());
        System.out.println(document.getContent());

        document.write("More content\n");
        System.out.println(document.getContent());

        document.restoreFromMemento(history.getLastMemento());
        System.out.println(document.getContent());
    }
}