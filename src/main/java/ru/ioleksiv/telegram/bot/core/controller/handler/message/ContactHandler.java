package ru.ioleksiv.telegram.bot.core.controller.handler.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;

import java.lang.reflect.Method;

public class ContactHandler extends Handler<Message> {
    private static final Logger LOG = LoggerFactory.getLogger(ContactHandler.class);

    public ContactHandler(@Nullable Object classInstance,
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
        return argument.getContact() != null;
    }

}
