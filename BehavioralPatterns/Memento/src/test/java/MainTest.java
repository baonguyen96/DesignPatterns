import memento.Document;
import memento.History;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest {
    private static Document document;
    private static History history;

    @BeforeClass
    public static void setup() {
        document = new Document("Initial content\n");
        history = new History();
    }

    @Test
    public void test0_init() {
        assertEquals("Initial content\n", document.getContent());
    }

    @Test
    public void test1_writeContentAndAddToHistory() {
        document.write("Additional content\n");
        history.addMemento(document.createMemento());
        assertEquals("Initial content\nAdditional content\n", document.getContent());

        document.write("More content\n");
        assertEquals("Initial content\nAdditional content\nMore content\n", document.getContent());
    }

    @Test
    public void test2_restoreFromHistory() {
        document.restoreFromMemento(history.getLastMemento());
        assertEquals("Initial content\nAdditional content\n", document.getContent());
    }

    @Test(expected = EmptyStackException.class)
    public void test3_restoreEmptyHistory() {
        history.getLastMemento();
    }
}