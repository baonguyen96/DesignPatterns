package strategy;

public class Calculator {
    private MathStrategy mathStrategy;

    public void setMathStrategy(MathStrategy strategy) {
        this.mathStrategy = strategy;
    }

    public double calculate(double first, double second) {
        double result = mathStrategy.operate(first, second);
        System.out.printf("%s(%f, %f) = %f%n", this.mathStrategy.getClass().getSimpleName(), first, second, result);
        return result;
    }
}
