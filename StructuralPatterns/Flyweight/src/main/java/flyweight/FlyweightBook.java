package flyweight;

import common.IBook;

public class FlyweightBook implements IBook {
    private final String name;
    private final String isbn;
    private final BookType bookType;

    public FlyweightBook(String name, String isbn, BookType bookType) {
        this.name = name;
        this.isbn = isbn;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookType getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", bookType=" + bookType.toString() +
                '}';
    }
}
