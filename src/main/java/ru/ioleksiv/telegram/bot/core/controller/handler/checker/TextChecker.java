package ru.ioleksiv.telegram.bot.core.controller.handler.checker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.utils.IterableUtils;

import java.util.Collection;
import java.util.regex.Pattern;

public class TextChecker implements Checker<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextChecker.class);

    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final String mRegExp;

    public TextChecker(@NotNull Collection<String> startWith,
                       @NotNull Collection<String> equalWith,
                       @NotNull Collection<String> endWith,
                       String regExp) {

        this.startWith = startWith;
        equalsWith = equalWith;
        this.endWith = endWith;
        mRegExp = regExp;
    }

    @Override
    public boolean check(@Nullable String argument) {

        if (argument == null) {
            return false;
        }

        if (!startWith.isEmpty() && !IterableUtils.checkAll(startWith, argument::startsWith)) {
            return false;
        }

        if (!endWith.isEmpty() && !IterableUtils.checkAll(endWith, argument::endsWith)) {
            return false;
        }

        if (!equalsWith.isEmpty() && !IterableUtils.checkAll(equalsWith, argument::equals)) {
            return false;
        }

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, argument)) {
            return false;
        }

        return true;
    }

}
