package strategy.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void operate() {
        assertEquals(2, new Multiplication().operate(1, 2), 0);
    }
}