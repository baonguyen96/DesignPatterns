import sql.context.Context;
import sql.language.Expression;
import sql.language.impl.From;
import sql.language.impl.Limit;
import sql.language.impl.Select;
import sql.language.impl.Where;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        query(context, new Select(Collections.singletonList("firstName"), new From("people")));

        query(context, new Select(Arrays.asList("firstName", "lastName"), new From("people")));

        query(context, new Limit(1, new Select(Arrays.asList("firstName", "lastName"), new From("people"))));

        query(context, new Select(Collections.singletonList("*"), new From("pet")));

        query(context, new Select(Arrays.asList("firstName", "lastName"),
                new From("people",
                        Where.builder()
                                .withPredicate("firstName", firstName -> firstName.startsWith("J") && firstName.endsWith("n"))
                                .withPredicate("lastName", lastName -> lastName.endsWith("i"))
                                .build()
                )
        ));
    }

    private static void query(Context context, Expression expression) {
        System.out.println(expression.interpret(context));
        System.out.println();
    }
}