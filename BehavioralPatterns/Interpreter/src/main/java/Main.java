import sql.context.Context;
import sql.language.Expression;
import sql.language.impl.From;
import sql.language.impl.Select;
import sql.language.impl.Where;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Expression query = new Select(Collections.singletonList("firstName"), new From("people"));
        Context context = new Context();
        List<String> result = query.interpret(context);
        System.out.println(result);

        Expression query2 = new Select(Arrays.asList("firstName", "lastName"), new From("people"));
        List<String> result2 = query2.interpret(context);
        System.out.println(result2);

        Expression query3 = new Select(Collections.singletonList("*"), new From("pet"));
        List<String> result3 = query3.interpret(context);
        System.out.println(result3);

        Expression query4 = new Select(Arrays.asList("firstName", "lastName"),
                new From("people",
                        Where.builder()
                                .withPredicate("firstName", firstName -> firstName.startsWith("J") && firstName.endsWith("n"))
                                .withPredicate("lastName", lastName -> lastName.endsWith("i"))
                                .build()
                )
        );
        List<String> result4 = query4.interpret(context);
        System.out.println(result4);
    }
}