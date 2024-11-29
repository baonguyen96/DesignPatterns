package sql.language.impl;

import sql.context.Context;
import sql.language.Expression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Where implements Expression {
    private final Map<String, Predicate<String>> filters;

    private Where(Map<String, Predicate<String>> filters) {
        this.filters = filters;
    }

    @Override
    public List<String> interpret(Context context) {
        this.filters.forEach(context::setFilter);
        return context.search();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Map<String, Predicate<String>> predicates;

        private Builder() {
            this.predicates = new HashMap<>();
        }

        public Builder withPredicate(String column, Predicate<String> filter) {
            Predicate<String> where = this.predicates.getOrDefault(column, filter).or(filter);
            this.predicates.put(column, where);
            return this;
        }

        public Where build() {
            return new Where(this.predicates);
        }
    }
}
