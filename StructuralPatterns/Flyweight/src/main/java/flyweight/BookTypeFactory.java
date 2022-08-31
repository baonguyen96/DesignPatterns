package flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookTypeFactory {
    private static final HashMap<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String bookType, String distributor, String otherData) {
        if (!bookTypes.containsKey(bookType)) {
            bookTypes.put(bookType, new BookType(bookType, distributor, otherData));
        }

        return bookTypes.get(bookType);
    }

    public static List<BookType> getBookTypes() {
        return new ArrayList<>(bookTypes.values());
    }
}
