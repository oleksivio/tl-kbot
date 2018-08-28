package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public class StringValidator implements Validator<String> {

    private final Collection<ValidateItem> matchItems = new ArrayList<>();
    private final Collection<ValidateItem> nonMatchItems = new ArrayList<>();
    private final String regExp;

    public StringValidator(String[] startWith,
                           String[] equalsWith,
                           String[] endWith,
                           String[] contains,
                           String regExp,
                           String[] notStartWith,
                           String[] notEndWith,
                           String[] notContains) {

        if (startWith.length > 0) {
            matchItems.add(new ValidateItem(startWith, String::startsWith));
        }
        if (equalsWith.length > 0) {
            matchItems.add(new ValidateItem(equalsWith, String::equals));
        }
        if (endWith.length > 0) {
            matchItems.add(new ValidateItem(endWith, String::endsWith));
        }
        if (contains.length > 0) {
            matchItems.add(new ValidateItem(contains, String::contains));
        }

        if (notContains.length > 0) {
            nonMatchItems.add(new ValidateItem(notContains, String::contains));
        }
        if (notEndWith.length > 0) {
            nonMatchItems.add(new ValidateItem(notEndWith, String::endsWith));
        }
        if (notStartWith.length > 0) {
            nonMatchItems.add(new ValidateItem(notStartWith, String::startsWith));
        }

        this.regExp = regExp;
    }

    @Override
    public boolean check(String argument) {

        if (!matchItems.isEmpty() && matchItems.stream().noneMatch(item -> item.isMatch(argument))) {
            return false;
        }

        if (!nonMatchItems.isEmpty() && nonMatchItems.stream().anyMatch(item -> item.isMatch(argument))) {
            return false;
        }

        return regExp.isEmpty() || Pattern.matches(regExp, argument);
    }

    private static class ValidateItem {
        private final List<String> strings;
        private final Checker checker;

        ValidateItem(String[] strings,
                     Checker checker) {
            this.strings = Arrays.asList(strings);
            this.checker = checker;
        }

        boolean isMatch(String arg) {
            return strings.stream().anyMatch(cond -> checker.isValid(arg, cond));
        }

        private interface Checker {
            boolean isValid(String arg, String condition);
        }
    }

}
