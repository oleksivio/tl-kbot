package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.lang.reflect.Method;
import java.util.Objects;

public class InlineQueryInvokeHandler extends AbstractInvokeHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineQueryInvokeHandler.class);

    @NotNull
    private final String mQuery;

    public InlineQueryInvokeHandler(@Nullable Object classInstance,
                                    @Nullable Method method,
                                    @NotNull String query) {
        super(classInstance, method);
        mQuery = query;
    }

    @Override
    public boolean isAcceptable(@Nullable Update update) {

        return update != null
                && update.getInlineQuery() != null
                && Objects.equals(update.getInlineQuery().getQuery(), mQuery);
    }

    @Override
    @Nullable
    protected ITelegram unpackMethodParameter(@Nullable Update update) {
        return update != null ? update.getInlineQuery() : null;
    }
}
