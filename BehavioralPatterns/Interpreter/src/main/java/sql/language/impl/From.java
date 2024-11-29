package sql.language.impl;

import sql.context.Context;
import sql.language.Expression;

import java.util.List;

public class From implements Expression {
    private final String table;
    private final Where where;

    public From(String table) {
        this(table, null);
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);

        if (where == null) {
            return context.search();
        }

        return where.interpret(context);
    }
}
