package context.impl;

import org.junit.Test;
import state.impl.*;

import static org.junit.Assert.*;

public class FoodOrderTest {
    @Test
    public void testWorkflow() {
        FoodOrder order = new FoodOrder();
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
        assertFalse(order.getOrderState().getStatus().isEmpty());
    }
}