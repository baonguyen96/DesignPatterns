import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class CartTest {
    private Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.addProduct(new Product("1", 1), new Product("2", 2), new Product("3", 3));
    }

    @Test
    public void testNext() {
        Iterator<Product> iterator = cart.iterator();
        int productCounts = countProducts(iterator);

        assertEquals(3, productCounts);
    }

    @Test
    public void testRemove() {
        Iterator<Product> iterator = cart.iterator();
        iterator.remove();

        int productCounts = countProducts(iterator);
        assertEquals(2, productCounts);
    }

    private int countProducts(Iterator<Product> iterator) {
        int productCounts = 0;

        while (iterator.hasNext()) {
            iterator.next();
            productCounts++;
        }

        return productCounts;
    }
}