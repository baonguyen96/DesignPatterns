package strategy.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void operate() {
        assertEquals(3, new Addition().operate(1, 2), 0);
    }
}