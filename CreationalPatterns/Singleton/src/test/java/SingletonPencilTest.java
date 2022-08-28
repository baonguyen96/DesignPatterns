import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonPencilTest {

    @Test
    public void testCreateNew() {
        SingletonPencil pencil1 = SingletonPencil.getInstance();
        assertEquals("SingletonPencil #1", pencil1.toString());

        SingletonPencil pencil2 = SingletonPencil.getInstance();
        assertEquals("SingletonPencil #1", pencil2.toString());
    }
}