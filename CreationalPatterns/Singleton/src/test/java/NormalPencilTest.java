import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalPencilTest {

    @Test
    void testCreateNew() {
        NormalPencil pencil1 = new NormalPencil();
        assertEquals("NormalPencil #1", pencil1.toString());

        NormalPencil pencil2 = new NormalPencil();
        assertEquals("NormalPencil #2", pencil2.toString());
    }
}