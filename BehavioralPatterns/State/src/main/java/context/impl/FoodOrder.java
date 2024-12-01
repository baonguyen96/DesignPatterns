package context.impl;

import context.Order;
import state.OrderState;
import state.impl.InitialState;

public class FoodOrder implements Order {
    private OrderState orderState;

    public FoodOrder() {
        this.orderState = new InitialState();
    }

    @Override
    public void setState(OrderState state) {
        this.orderState = state;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void transitionToNextState() {
        this.orderState.transitionToNext(this);
    }

    public void showCurrentStatus() {
        System.out.println(this.orderState.getStatus());
    }
}
