import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPencilTest {

    @Test
    void testCreateNew() {
        SingletonPencil pencil1 = SingletonPencil.getInstance();
        assertEquals("SingletonPencil #1", pencil1.toString());

        SingletonPencil pencil2 = SingletonPencil.getInstance();
        assertEquals("SingletonPencil #1", pencil2.toString());
    }
}