package sql.context;

public class Column {
    private final String name;
    private final String value;

    public Column(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
