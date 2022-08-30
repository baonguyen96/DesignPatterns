package composite;

public class Item implements Order {
    private String name;
    private double amount;

    public Item(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
