package command.impl;

import command.Order;
import stock.Stock;

public class BuyStockOrder implements Order {
    private final Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
