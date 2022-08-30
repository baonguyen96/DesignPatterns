package decorator.impl;

import decorator.Pizza;

public class Topping implements Pizza {
    protected Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public double getCost() {
        return this.pizza.getCost();
    }
}
