package decorator;

public class Chicken extends Topping {
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Chicken";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }
}
