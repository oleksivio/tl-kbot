package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Pattern;

public class TextInvokeHandler extends AbstractInvokeHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextInvokeHandler.class);

    private final Collection<String> mStartWith;
    private final Collection<String> mEqualsWith;
    private final Collection<String> mEndWith;
    private final String mRegExp;

    public TextInvokeHandler(@NotNull Object classInstance,
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
        TextInvokeHandler thisObj = (TextInvokeHandler) o;
        return Objects.equals(mStartWith, thisObj.mStartWith) &&
                Objects.equals(mEqualsWith, thisObj.mEqualsWith) &&
                Objects.equals(mEndWith, thisObj.mEndWith);
    }

    @Override
    public boolean isAcceptable(Update update) {
        if (update == null) {
            return false;
        }

        Message message = update.getMessage();

        if (message == null) {
            return false;
        }

        String text = message.getText();

        if (text == null) {
            return false;
        }

        if (!mStartWith.isEmpty() && !check(mStartWith, text::startsWith)) {
            return false;
        }

        if (!mEndWith.isEmpty() && !check(mEndWith, text::endsWith)) {
            return false;
        }

        if (!mEqualsWith.isEmpty() && !check(mEqualsWith, text::equals)) {
            return false;
        }

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, text)) {
            return false;
        }

        return true;
    }

    private boolean check(Iterable<String> items, IChecker iterableChecker) {
        for (String item : items) {
            if (iterableChecker.check(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public ITelegram unpackMethodParameter(Update update) {
        return update.getMessage();
    }

    private interface IChecker {
        boolean check(String item);
    }

}
