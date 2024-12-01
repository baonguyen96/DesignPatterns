package sql.context;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Context {
    private static final Map<String, Table> tables = new HashMap<>();
    private String table;
    private List<String> columns;
    private Map<String, Predicate<String>> whereFilters;
    private int limit;

    static {
        tables.put("people", new Table("people", Arrays.asList(
                new Row(new Column("firstName", "John"), new Column("lastName", "Doe")),
                new Row(new Column("firstName", "Jan"), new Column("lastName", "Kowalski")),
                new Row(new Column("firstName", "Dominic"), new Column("lastName", "Doom"))
        )));

        tables.put("pet", new Table("pet", Arrays.asList(
                new Row(new Column("name", "Kitty")),
                new Row(new Column("name", "Dungo")),
                new Row(new Column("name", "Ravenclaw"))
        )));
    }

    public Context() {
        this.clear();
    }

    private void clear() {
        this.table = null;
        this.columns = new ArrayList<>();
        this.whereFilters = new HashMap<>();
        this.setLimit(Integer.MAX_VALUE);
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumns(List<String> columns) {
        this.columns.addAll(columns);
    }

    public void setFilter(String name, Predicate<String> whereFilter) {
        this.whereFilters.put(name, whereFilter);
    }

    public void setLimit(int limit) {
        this.limit = limit < 0 ? Integer.MAX_VALUE : limit;
    }

    public List<String> search() {
        List<String> result = Context.tables
                .get(this.table.toLowerCase())
                .getRows()
                .stream()
                .filter(row -> row
                        .getColumns()
                        .stream()
                        .allMatch(column -> !this.whereFilters.containsKey(column.getName()) || this.whereFilters.get(column.getName()).test(column.getValue()))
                )
                .limit(this.limit)
                .map(row -> row
                        .getColumns()
                        .stream()
                        .filter(column -> this.columns.contains("*") || this.columns.contains(column.getName()))
                        .map(Column::getValue)
                        .collect(Collectors.joining(" "))
                )
                .collect(Collectors.toList());

        this.clear();

        return result;
    }
}
