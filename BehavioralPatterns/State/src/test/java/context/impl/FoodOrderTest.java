package context.impl;

import org.junit.Test;
import state.impl.*;

import static org.junit.Assert.*;

public class FoodOrderTest {
    private final FoodOrder order = new FoodOrder();

    @Test
    public void testWorkflow() {
        assertTrue(order.getOrderState() instanceof InitialState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof OrderPlacedState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof FoodPreparationState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof WaitingForPickupState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof OutForDeliveryState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof DeliveredState);

        order.transitionToNextState();
        assertTrue(order.getOrderState() instanceof DeliveredState);
    }
}