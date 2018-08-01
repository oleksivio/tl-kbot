package ru.ioleksiv.telegram.bot.core.controller.handler.message.text;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.utils.IterableUtils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Pattern;

public abstract class TextHandler extends Handler<Message> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextHandler.class);

    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final String mRegExp;

    TextHandler(@NotNull ActionBuilder actionBuilder,
                @NotNull Object classInstance,
                @NotNull Method method,
                @NotNull Collection<String> startWith,
                @NotNull Collection<String> equalWith,
                @NotNull Collection<String> endWith,
                String regExp) {
        super(actionBuilder, classInstance, method);
        this.startWith = startWith;
        equalsWith = equalWith;
        this.endWith = endWith;
        mRegExp = regExp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startWith, equalsWith, endWith);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !Objects.equals(getClass(), o.getClass())) {
            return false;
        }
        TextHandler thisObj = (TextHandler) o;
        return Objects.equals(startWith, thisObj.startWith) &&
                Objects.equals(equalsWith, thisObj.equalsWith) &&
                Objects.equals(endWith, thisObj.endWith);
    }

    @Override
    protected boolean checker(@NotNull Message argument) {
        String text = argument.getText();

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

}
