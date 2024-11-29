package sql.language.impl;

import sql.context.Context;
import sql.language.Expression;

import java.util.List;

public class Select implements Expression {
    private final List<String> columns;
    private final From from;

    public Select(List<String> columns, From from) {
        this.columns = columns;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setColumns(columns);
        return from.interpret(context);
    }
}
