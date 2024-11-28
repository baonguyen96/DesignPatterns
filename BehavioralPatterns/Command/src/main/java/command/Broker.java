package command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Broker {
    private final List<Order> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void takeOrder(Order... orders) {
        this.orders.addAll(Arrays.asList(orders));
    }

    public void placeAllOrders() {
        this.orders.forEach(Order::execute);
        this.orders.clear();
    }
}
