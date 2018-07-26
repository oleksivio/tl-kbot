package ru.ioleksiv.telegram.bot.core.controller.handler.callback;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.utils.IterableUtils;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.regex.Pattern;

public class CallbackHandler extends Handler<CallbackQuery> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackHandler.class);
    private final Collection<String> startWith;
    private final Collection<String> equalsWith;
    private final Collection<String> endWith;
    private final String regExp;

    public CallbackHandler(@NotNull Object classInstance,
                           @NotNull Method method,
                           @NotNull Collection<String> startWith,
                           @NotNull Collection<String> equalWith,
                           @NotNull Collection<String> endWith,
                           String regExp) {
        super(classInstance, method);
        this.startWith = startWith;
        equalsWith = equalWith;
        this.endWith = endWith;
        this.regExp = regExp;
    }

    @Override
    public CallbackQuery unpacker(@NotNull Update update) {
        return update.getCallbackQuery();
    }

    @Override
    protected boolean checker(@NotNull CallbackQuery argument) {
        String data = argument.getData();

        if (data == null) {
            return false;
        }

        if (!startWith.isEmpty() && !IterableUtils.checkAll(startWith, data::startsWith)) {
            return false;
        }

        if (!endWith.isEmpty() && !IterableUtils.checkAll(endWith, data::endsWith)) {
            return false;
        }

        if (!equalsWith.isEmpty() && !IterableUtils.checkAll(equalsWith, data::equals)) {
            return false;
        }

        if (!regExp.isEmpty() && !Pattern.matches(regExp, data)) {
            return false;
        }

        return true;
    }

}
