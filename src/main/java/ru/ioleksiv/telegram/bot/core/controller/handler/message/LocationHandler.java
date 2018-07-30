package ru.ioleksiv.telegram.bot.core.controller.handler.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;

import java.lang.reflect.Method;

public class LocationHandler extends Handler<Message> {
    private static final Logger LOG = LoggerFactory.getLogger(LocationHandler.class);

    public LocationHandler(@Nullable Object classInstance,
                           @Nullable Method method) {
        super(classInstance, method);
    }

    @Override
    @Nullable
    protected Message unpacker(@NotNull Update update) {
        return update.getMessage();
    }

    @Override
    protected boolean checker(@NotNull Message argument) {
        return argument.getLocation() != null;
    }

}
