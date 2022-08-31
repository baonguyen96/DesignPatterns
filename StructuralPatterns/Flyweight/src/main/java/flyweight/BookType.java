package flyweight;

public class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
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
        return "BookType{" +
                "type='" + getType() + '\'' +
                ", distributor='" + getDistributor() + '\'' +
                ", otherData='" + getOtherData() + '\'' +
                '}';
    }
}
