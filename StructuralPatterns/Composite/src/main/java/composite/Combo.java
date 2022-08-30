package composite;

import java.util.List;

public class Combo implements Order {
    private final List<Order> orders;

    public Combo(List<Order> items) {
        this.orders = items;
    }

    @Override
    public double getAmount() {
        return orders.stream().mapToDouble(Order::getAmount).sum();
    }
}
