import command.Broker;
import command.impl.BuyStockOrder;
import command.impl.SellStockOrder;
import stock.Stock;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.takeOrder(
                new BuyStockOrder(new Stock("A", 1)),
                new SellStockOrder(new Stock("B", 2))
        );

        broker.placeAllOrders();
    }
}