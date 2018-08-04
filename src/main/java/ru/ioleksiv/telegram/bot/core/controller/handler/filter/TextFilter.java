package ru.ioleksiv.telegram.bot.core.controller.handler.filter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.utils.IterableUtils;

import java.util.Collection;
import java.util.regex.Pattern;

public abstract class TextFilter<T> implements Filter<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextFilter.class);

    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final String mRegExp;

    public TextFilter(@NotNull Collection<String> startWith,
                      @NotNull Collection<String> equalWith,
                      @NotNull Collection<String> endWith,
                      String regExp) {

        this.startWith = startWith;
        equalsWith = equalWith;
        this.endWith = endWith;
        mRegExp = regExp;
    }

    @Override
    public boolean check(@NotNull T argument) {

        String  text = extractText(argument);

        if (text == null) {
            return false;
        }

        if (!startWith.isEmpty() && !IterableUtils.checkAll(startWith, text::startsWith)) {
            return false;
        }

        if (!endWith.isEmpty() && !IterableUtils.checkAll(endWith, text::endsWith)) {
            return false;
        }

        if (!equalsWith.isEmpty() && !IterableUtils.checkAll(equalsWith, text::equals)) {
            return false;
        }

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, text)) {
            return false;
        }

        return true;
    }

    @Nullable
    protected abstract String extractText(T argument);

}
