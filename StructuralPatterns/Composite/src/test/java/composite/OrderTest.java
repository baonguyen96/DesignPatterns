package composite;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void testGetAmountSingleItem() {
        Order item1 = new Item("item1", 1.0);
        assertEquals(1, item1.getAmount(), 0.001);
    }

    @Test
    public void testGetAmountCombo() {
        Order item1 = new Item("item1", 1.0);
        Order item2 = new Item("item2", 2.0);
        Order combo = new Combo(Arrays.asList(item1, item2));
        assertEquals(3, combo.getAmount(), 0.001);
    }
}