package ru.ioleksiv.telegram.bot.core.controller.handler.checker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.regex.Pattern;

public class TextChecker implements Checker<String> {
    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final Collection<String> contains;
    private final String mRegExp;

    public TextChecker(@NotNull Collection<String> startWith,
                       @NotNull Collection<String> equalsWith,
                       @NotNull Collection<String> endWith,
                       @NotNull Collection<String> contains,
                       String regExp) {

        this.startWith = startWith;
        this.equalsWith = equalsWith;
        this.endWith = endWith;
        this.contains = contains;
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

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, argument)) {
            return false;
        }

        return true;
    }

}
