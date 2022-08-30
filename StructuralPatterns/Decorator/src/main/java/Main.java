import decorator.*;
import decorator.impl.BasePizza;
import decorator.impl.Chicken;
import decorator.impl.Olive;
import decorator.impl.Pepperoni;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        display(pizza);

        pizza = new Pepperoni(pizza);
        display(pizza);

        pizza = new Chicken(pizza);
        display(pizza);

        pizza = new Olive(pizza);
        display(pizza);
    }

    public static void display(Pizza pizza) {
        System.out.println(pizza.getDescription() + " costs $" + pizza.getCost());
    }
}
