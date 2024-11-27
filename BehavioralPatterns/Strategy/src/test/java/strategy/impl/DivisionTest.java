package strategy.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void operate() {
        assertEquals(2, new Division().operate(4, 2), 0);
    }
}