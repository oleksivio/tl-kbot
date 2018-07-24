package ru.ioleksiv.telegram.bot.core.controller.handler.inline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.inline.InlineQuery;

import java.lang.reflect.Method;
import java.util.Objects;

public class InlineQueryHandler extends Handler<InlineQuery> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineQueryHandler.class);

    @NotNull
    private final String query;

    public InlineQueryHandler(@Nullable Object classInstance,
                              @Nullable Method method,
                              @NotNull String query) {
        super(classInstance, method);
        this.query = query;
    }

    @Override
    @Nullable
    protected InlineQuery unpacker(@Nullable Update update) {
        return update != null ? update.getInlineQuery() : null;
    }

    @Override
    protected boolean checker(@NotNull InlineQuery argument) {
        return Objects.equals(argument.getQuery(), query);
    }
}
