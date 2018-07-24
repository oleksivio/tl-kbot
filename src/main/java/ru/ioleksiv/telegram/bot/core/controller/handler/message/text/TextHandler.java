package ru.ioleksiv.telegram.bot.core.controller.handler.message.text;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.utils.IterableUtils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Pattern;

public abstract class TextHandler extends Handler<Message> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextHandler.class);

    private final Collection<String> mStartWith;
    private final Collection<String> mEqualsWith;
    private final Collection<String> mEndWith;
    private final String mRegExp;

    public TextHandler(@NotNull Object classInstance,
                       @NotNull Method method,
                       @NotNull Collection<String> startWith,
                       @NotNull Collection<String> equalWith,
                       @NotNull Collection<String> endWith,
                       String regExp) {
        super(classInstance, method);
        mStartWith = startWith;
        mEqualsWith = equalWith;
        mEndWith = endWith;
        mRegExp = regExp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mStartWith, mEqualsWith, mEndWith);
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
        return Objects.equals(mStartWith, thisObj.mStartWith) &&
                Objects.equals(mEqualsWith, thisObj.mEqualsWith) &&
                Objects.equals(mEndWith, thisObj.mEndWith);
    }

    @Override
    protected boolean checker(@NotNull Message argument) {
        String text = argument.getText();

        if (text == null) {
            return false;
        }

        if (!mStartWith.isEmpty() && !IterableUtils.checkAll(mStartWith, text::startsWith)) {
            return false;
        }

        if (!mEndWith.isEmpty() && !IterableUtils.checkAll(mEndWith, text::endsWith)) {
            return false;
        }

        if (!mEqualsWith.isEmpty() && !IterableUtils.checkAll(mEqualsWith, text::equals)) {
            return false;
        }

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, text)) {
            return false;
        }

        return true;
    }

}
