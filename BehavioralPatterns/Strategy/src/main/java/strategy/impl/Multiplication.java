package strategy.impl;

import strategy.MathStrategy;

public class Multiplication implements MathStrategy {
    @Override
    public double operate(double first, double second) {
        return first * second;
    }
}
