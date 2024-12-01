package context;

import state.OrderState;

public interface Order {
    void setState(OrderState state);
}
