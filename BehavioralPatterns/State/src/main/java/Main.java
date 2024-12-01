import context.impl.FoodOrder;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.showCurrentStatus();

        IntStream.range(0, 6).forEach(ignore -> {
            order.transitionToNextState();
            order.showCurrentStatus();
        });
    }
}