package strategy.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {
    @Test
    public void operate() {
        assertEquals(-1, new Subtraction().operate(1, 2), 0);
    }
}