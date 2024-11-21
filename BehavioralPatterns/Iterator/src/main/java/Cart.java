import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cart {
    private final List<Product> products;

    public Cart() {
        this(new ArrayList<>());
    }

    public Cart(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product... product) {
        this.products.addAll(Arrays.asList(product));
    }

    public Iterator<Product> iterator() {
        return new CartIterator();
    }

    private class CartIterator implements Iterator<Product> {
        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < products.size();
        }

        @Override
        public Product next() {
            return products.get(currentPosition++);
        }

        @Override
        public void remove() {
            products.remove(currentPosition--);

            if (currentPosition < 0) {
                currentPosition = 0;
            }
        }
    }
}
