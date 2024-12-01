package sql.language;

import sql.context.Context;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
