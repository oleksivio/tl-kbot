package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.CallbackQuery;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import java.util.regex.Pattern;

public class CallbackInvokeHandler extends AbstractInvokeHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackInvokeHandler.class);
    private final Collection<String> mStartWith;
    private final Collection<String> mEqualsWith;
    private final Collection<String> mEndWith;
    private final String mRegExp;

    public CallbackInvokeHandler(@NotNull Object classInstance,
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
        CallbackInvokeHandler thisObj = (CallbackInvokeHandler) o;
        return Objects.equals(mStartWith, thisObj.mStartWith) &&
                Objects.equals(mEqualsWith, thisObj.mEqualsWith) &&
                Objects.equals(mEndWith, thisObj.mEndWith);
    }

    @Override
    public boolean isAcceptable(Update update) {
        if (update == null) {
            return false;
        }

        CallbackQuery callbackQuery = update.getCallbackQuery();

        if (callbackQuery == null) {
            return false;
        }

        String data = callbackQuery.getData();

        if (data == null) {
            return false;
        }

        if (!mStartWith.isEmpty() && !check(mStartWith, data::startsWith)) {
            return false;
        }

        if (!mEndWith.isEmpty() && !check(mEndWith, data::endsWith)) {
            return false;
        }

        if (!mEqualsWith.isEmpty() && !check(mEqualsWith, data::equals)) {
            return false;
        }

        if (!mRegExp.isEmpty() && !Pattern.matches(mRegExp, data)) {
            return false;
        }

        return true;
    }

    private boolean check(Iterable<String> items, CallbackInvokeHandler.IChecker iterableChecker) {
        for (String item : items) {
            if (iterableChecker.check(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public ITelegram unpackMethodParameter(Update update) {
        return update.getCallbackQuery();
    }

    private interface IChecker {
        boolean check(String item);
    }
}
