package sql.language.impl;

import sql.context.Context;
import sql.language.Expression;

import java.util.List;

public class Limit implements Expression {
    private final int limit;
    private final Select select;

    public Limit(int limit, Select select) {
        this.limit = limit;
        this.select = select;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setLimit(limit);
        return select.interpret(context);
    }
}
