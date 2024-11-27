package strategy;

public interface MathStrategy {
    double operate(double first, double second);
    enum Operation {ADD, SUBTRACT, MULTIPLY, DIVIDE}
}
