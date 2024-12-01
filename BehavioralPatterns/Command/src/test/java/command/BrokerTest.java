package command;

import command.impl.BuyStockOrder;
import command.impl.SellStockOrder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import stock.Stock;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BrokerTest {
    private final Broker broker = new Broker();

    @Test
    public void test1_takeOrder() {
        broker.takeOrder(
                new BuyStockOrder(new Stock("A", 1)),
                new SellStockOrder(new Stock("B", 2))
        );
        assertEquals(2, broker.getOrders().size());
    }

    @Test
    public void test2_placeAllOrders() {
        broker.placeAllOrders();
        assertEquals(0, broker.getOrders().size());
    }
}