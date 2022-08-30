import decorator.*;

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
