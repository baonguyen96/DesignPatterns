package clone;

import common.IBook;

public class ClonedBook implements IBook {
    private final String name;
    private final String isbn;
    private final String type;
    private final String distributor;
    private final String otherData;

    public ClonedBook(String name, String isbn, String type, String distributor, String otherData) {
        this.name = name;
        this.isbn = isbn;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }

    @Override
    public String toString() {
        return "ClonedBook{" +
                "name='" + getName() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", type='" + getType() + '\'' +
                ", distributor='" + getDistributor() + '\'' +
                ", otherData='" + getOtherData() + '\'' +
                '}';
    }
}
