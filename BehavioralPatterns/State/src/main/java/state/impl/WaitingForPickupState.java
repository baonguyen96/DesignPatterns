package state.impl;

import context.Order;
import state.OrderState;

public class WaitingForPickupState implements OrderState {
    @Override
    public void transitionToNext(Order order) {
        order.setState(new OutForDeliveryState());
    }
}
