package command.impl;

import command.Order;
import stock.Stock;

public class SellStockOrder implements Order {
    private final Stock stock;

    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
