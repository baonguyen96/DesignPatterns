package decorator;

import decorator.impl.BasePizza;
import decorator.impl.Chicken;
import decorator.impl.Olive;
import decorator.impl.Pepperoni;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {
    private Pizza pizza;
    private final double DELTA = 0.001;

    @Before
    public void setUp() {
        pizza = new BasePizza();
    }

    @Test
    public void testBasePizza() {
        assertEquals("Base pizza", pizza.getDescription());
        assertEquals(10, pizza.getCost(), DELTA);
    }

    @Test
    public void testPizzaWithToppings() {
        pizza = new Chicken(new Olive(new Pepperoni(pizza)));
        assertEquals("Base pizza with Pepperoni with Olive with Chicken", pizza.getDescription());
        assertEquals(20, pizza.getCost(), DELTA);
    }
}