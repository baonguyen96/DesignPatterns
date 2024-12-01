package state.impl;

import context.Order;
import state.OrderState;

public class DeliveredState implements OrderState {
    @Override
    public void transitionToNext(Order order) {
        System.out.println("Order is already delivered. Nothing to do here.");
    }
}
