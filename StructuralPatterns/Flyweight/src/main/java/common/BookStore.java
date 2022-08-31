package common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookStore {
    private final List<IBook> books;

    public BookStore() {
        books = new LinkedList<>();
    }

    public void storeBook(IBook book) {
        books.add(book);
    }

    public int countBooks() {
        return books.size();
    }
}
