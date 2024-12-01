package sql.context;

import org.junit.Test;
import sql.language.Expression;
import sql.language.impl.From;
import sql.language.impl.Limit;
import sql.language.impl.Select;
import sql.language.impl.Where;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ContextTest {
    private final Context context = new Context();

    @Test
    public void search_singleColumn() {
        Expression query = new Select(Collections.singletonList("firstName"), new From("people"));
        List<String> expected = Arrays.asList("John", "Jan", "Dominic");
        List<String> actual = query.interpret(context);
        assertEquals(expected, actual);
    }

    @Test
    public void search_multipleColumns() {
        Expression query = new Select(Arrays.asList("firstName", "lastName"), new From("people"));
        List<String> expected = Arrays.asList("John Doe", "Jan Kowalski", "Dominic Doom");
        List<String> actual = query.interpret(context);
        assertEquals(expected, actual);
    }

    @Test
    public void search_all() {
        Expression query = new Select(Collections.singletonList("*"), new From("pet"));
        List<String> expected = Arrays.asList("Kitty", "Dungo", "Ravenclaw");
        List<String> actual = query.interpret(context);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void search_dne() {
        Expression query = new Select(Collections.singletonList("*"), new From("dne"));
        query.interpret(context);
    }

    @Test
    public void search_allWithLimit() {
        Expression query = new Limit(1, new Select(Collections.singletonList("*"), new From("pet")));
        assertEquals(1, query.interpret(context).size());

        query = new Limit(-1, new Select(Collections.singletonList("*"), new From("pet")));
        assertEquals(3, query.interpret(context).size());
    }

    @Test
    public void search_withWhere() {
        Expression query = new Select(Arrays.asList("firstName", "lastName"),
                new From("people",
                        Where.builder()
                                .withPredicate("firstName", firstName -> firstName.startsWith("J") && firstName.endsWith("n"))
                                .withPredicate("lastName", lastName -> lastName.endsWith("i"))
                                .build()
                )
        );
        List<String> expected = Collections.singletonList("Jan Kowalski");
        List<String> actual = query.interpret(context);
        assertEquals(expected, actual);
    }
}