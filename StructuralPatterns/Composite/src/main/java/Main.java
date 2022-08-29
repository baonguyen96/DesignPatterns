import composite.Combo;
import composite.Item;
import composite.Order;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order item1 = new Item("item1", 1.0);
        Order item2 = new Item("item2", 2.0);
        Order combo = new Combo(Arrays.asList(item1, item2));

        System.out.println("Item1 has price $" + item1.getAmount());
        System.out.println("Item2 has price $" + item2.getAmount());
        System.out.println("Combo has price $" + combo.getAmount());
    }
}
