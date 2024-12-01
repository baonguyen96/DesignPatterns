package state;

import context.Order;

public interface OrderState {
    void transitionToNext(Order order);

    default String getStatus() {
        return this.getClass().getSimpleName();
    }
}
