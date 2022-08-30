package decorator;

public class Olive extends Topping {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }
}
