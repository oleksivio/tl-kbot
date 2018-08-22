package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class StringValidator implements Validator<String> {
    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final Collection<String> contains;
    private final String regExp;

    public StringValidator(String[] startWith,
                           String[] equalsWith,
                           String[] endWith,
                           String[] contains,
                           String regExp) {

        this.startWith = Arrays.asList(startWith);
        this.equalsWith = Arrays.asList(equalsWith);
        this.endWith = Arrays.asList(endWith);
        this.contains = Arrays.asList(contains);
        this.regExp = regExp;
    }

    @Override
    public boolean check(String argument) {

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

        return regExp.isEmpty() || Pattern.matches(regExp, argument);
    }

}
