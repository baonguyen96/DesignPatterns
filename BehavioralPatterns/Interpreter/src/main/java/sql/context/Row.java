package sql.context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Row {
    private final List<Column> columns;

    public Row(Column... columns) {
        this.columns = new ArrayList<>();
        this.columns.addAll(Arrays.asList(columns));
    }

    public List<Column> getColumns() {
        return columns;
    }
}
