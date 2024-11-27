import strategy.Calculator;
import strategy.MathStrategy;
import strategy.impl.Addition;
import strategy.impl.Division;
import strategy.impl.Multiplication;
import strategy.impl.Subtraction;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();

        for (MathStrategy.Operation operation : MathStrategy.Operation.values()) {
            switch (operation) {
                case ADD:
                    calculator.setMathStrategy(new Addition());
                    break;
                case SUBTRACT:
                    calculator.setMathStrategy(new Subtraction());
                    break;
                case MULTIPLY:
                    calculator.setMathStrategy(new Multiplication());
                    break;
                default:
                    calculator.setMathStrategy(new Division());
                    break;
            }

            calculator.calculate(random.nextDouble(), random.nextDouble());
        }
    }
}