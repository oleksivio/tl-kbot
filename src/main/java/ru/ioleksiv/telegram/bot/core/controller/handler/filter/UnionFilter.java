package ru.ioleksiv.telegram.bot.core.controller.handler.filter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class UnionFilter<T> implements Filter<T> {

    private final Collection<Filter<T>> filters = new ArrayList<>();

    public void add(Filter<T> filter) {
        filters.add(filter);
    }

    @Override
    public boolean check(@NotNull T argument) {
        for (Filter<T> filter : filters) {
            if (!filter.check(argument)) {
                return false;
            }
        }

        return true;
    }
}
