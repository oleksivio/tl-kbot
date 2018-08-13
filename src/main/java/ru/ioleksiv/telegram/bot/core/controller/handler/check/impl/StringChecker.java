package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class StringChecker implements Checker<String> {
    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final Collection<String> contains;
    private final String mRegExp;

    public StringChecker(@NotNull String[] startWith,
                         @NotNull String[] equalsWith,
                         @NotNull String[] endWith,
                         @NotNull String[] contains,
                         String regExp) {

        this.startWith = Arrays.asList(startWith);
        this.equalsWith = Arrays.asList(equalsWith);
        this.endWith = Arrays.asList(endWith);
        this.contains = Arrays.asList(contains);
        mRegExp = regExp;
    }

    @Override
    public boolean check(@Nullable String argument) {

        if (argument == null) {
            return false;
        }

        if (!startWith.isEmpty() && startWith.stream().noneMatch(argument::startsWith)) {
            return false;
        }

        if (!endWith.isEmpty() && endWith.stream().noneMatch(argument::endsWith)) {
            return false;
        }

        if (!equalsWith.isEmpty() && equalsWith.stream().noneMatch(argument::equals)) {
            return false;
        }

        if (!contains.isEmpty() && contains.stream().noneMatch(argument::contains)) {
            return false;
        }

        return mRegExp.isEmpty() || Pattern.matches(mRegExp, argument);
    }

}
