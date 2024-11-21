import java.util.Iterator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        IntStream.range(0, 10).forEach(i -> cart.addProduct(new Product("Product #" + i, i)));
        Iterator<Product> iterator = cart.iterator();

        iterator.remove();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}