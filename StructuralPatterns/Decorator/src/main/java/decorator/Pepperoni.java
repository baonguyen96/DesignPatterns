package decorator;

public class Pepperoni extends Topping {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }
}
