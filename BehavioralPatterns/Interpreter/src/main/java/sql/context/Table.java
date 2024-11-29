package sql.context;

import java.util.List;

public class Table {
    private final String name;
    private final List<Row> rows;

    public Table(String name, List<Row> rows) {
        this.name = name;
        this.rows = rows;
    }

    public List<Row> getRows() {
        return rows;
    }
}
