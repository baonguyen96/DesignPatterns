package decorator.impl;

import decorator.Pizza;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Base pizza";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
