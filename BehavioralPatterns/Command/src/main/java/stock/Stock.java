package stock;

public class Stock {
    private final String name;
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.printf("Buying %d %s stock(s)\n", quantity, name);
    }

    public void sell() {
        System.out.printf("Selling %d %s stock(s)\n", quantity, name);
    }
}
