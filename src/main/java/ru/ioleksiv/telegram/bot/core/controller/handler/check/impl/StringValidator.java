package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

        matchItems.add(new ValidateItem(startWith, String::startsWith));
        matchItems.add(new ValidateItem(equalsWith, String::equals));
        matchItems.add(new ValidateItem(endWith, String::endsWith));
        matchItems.add(new ValidateItem(contains, String::contains));

        nonMatchItems.add(new ValidateItem(notContains, String::contains));
        nonMatchItems.add(new ValidateItem(notEndWith, String::endsWith));
        nonMatchItems.add(new ValidateItem(notStartWith, String::startsWith));

        this.regExp = regExp;
    }

    @Override
    public boolean check(String argument) {

        if (matchItems.stream().anyMatch(item -> item.hasAny(argument))) {
            return false;
        }

        if (nonMatchItems.stream().anyMatch(item -> !item.hasAny(argument))) {
            return false;
        }

        return regExp.isEmpty() || Pattern.matches(regExp, argument);
    }

    private static class ValidateItem {
        private final Collection<String> strings;
        private final Checker checker;

        ValidateItem(String[] strings,
                     Checker checker) {
            this.strings = Arrays.asList(strings);
            this.checker = checker;
        }

        boolean hasAny(String arg) {
            return !strings.isEmpty() && strings.stream().anyMatch(cond -> checker.isValid(arg, cond));
        }

        private interface Checker {
            boolean isValid(String arg, String condition);
        }
    }

}
