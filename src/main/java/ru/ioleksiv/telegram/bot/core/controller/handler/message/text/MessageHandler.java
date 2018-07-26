package ru.ioleksiv.telegram.bot.core.controller.handler.message.text;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;

import java.lang.reflect.Method;
import java.util.Collection;

public class MessageHandler extends TextHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageHandler.class);

    public MessageHandler(@NotNull Object classInstance,
                          @NotNull Method method,
                          @NotNull Collection<String> startWith,
                          @NotNull Collection<String> equalWith,
                          @NotNull Collection<String> endWith, String regExp) {
        super(classInstance, method, startWith, equalWith, endWith, regExp);
    }

    @Override
    public Message unpacker(@NotNull Update update) {
        return update.getMessage();
    }



}
