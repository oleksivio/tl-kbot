package ru.ioleksiv.telegram.bot.core.controller.handler.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.lang.reflect.Method;

public class ContactHandler extends Handler<Message> {
    private static final Logger LOG = LoggerFactory.getLogger(ContactHandler.class);

    public ContactHandler(@NotNull ActionBuilder actionBuilder,
                          @Nullable Object classInstance,
                          @Nullable Method method) {
        super(actionBuilder, classInstance, method);
    }

    @Override
    @Nullable
    protected Message unpacker(@NotNull Update update) {
        return update.getMessage();
    }

    @Override
    protected boolean checker(@NotNull Message argument) {
        return argument.getContact() != null;
    }

}
