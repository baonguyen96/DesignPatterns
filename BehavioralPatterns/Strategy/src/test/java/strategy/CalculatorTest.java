package strategy;

import org.junit.Test;
import strategy.impl.Addition;
import strategy.impl.Subtraction;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void calculate() {
        Calculator calculator = new Calculator();

        calculator.setMathStrategy(new Addition());
        assertEquals(1, calculator.calculate(1, 0), 0);

        calculator.setMathStrategy(new Subtraction());
        assertEquals(0, calculator.calculate(1, 1), 0);
    }
}