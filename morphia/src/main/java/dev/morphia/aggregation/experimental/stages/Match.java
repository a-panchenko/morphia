package dev.morphia.aggregation.experimental.stages;

import dev.morphia.query.Query;

public class Match extends Stage {
    private Query query;

    protected Match(final Query query) {
        super("$match");
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }

    public static Match on(final Query<?> query) {
        return new Match(query);
    }
}
