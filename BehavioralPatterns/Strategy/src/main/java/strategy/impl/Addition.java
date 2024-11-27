package strategy.impl;

import strategy.MathStrategy;

public class Addition implements MathStrategy {
    @Override
    public double operate(double first, double second) {
        return first + second;
    }
}
