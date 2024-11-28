package command.impl;

import org.junit.Test;
import org.mockito.Mockito;
import stock.Stock;

public class SellStockOrderTest {
    @Test
    public void execute() {
        Stock stock = new Stock("name", 1);
        Stock spyStock = Mockito.spy(stock);
        new SellStockOrder(spyStock).execute();

        Mockito.verify(spyStock, Mockito.only()).sell();
    }
}