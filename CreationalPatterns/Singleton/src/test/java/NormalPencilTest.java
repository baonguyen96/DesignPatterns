import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalPencilTest {

    @Test
    public void testCreateNew() {
        NormalPencil pencil1 = new NormalPencil();
        assertEquals("NormalPencil #1", pencil1.toString());

        NormalPencil pencil2 = new NormalPencil();
        assertEquals("NormalPencil #2", pencil2.toString());
    }
}