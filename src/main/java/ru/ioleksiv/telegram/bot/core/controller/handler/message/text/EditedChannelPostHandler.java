package ru.ioleksiv.telegram.bot.core.controller.handler.message.text;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.builder.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;

import java.lang.reflect.Method;
import java.util.Collection;

public class EditedChannelPostHandler extends TextHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(EditedChannelPostHandler.class);

    public EditedChannelPostHandler(@NotNull ActionBuilder actionBuilder,
                                    @NotNull Object classInstance,
                                    @NotNull Method method,
                                    @NotNull Collection<String> startWith,
                                    @NotNull Collection<String> equalWith,
                                    @NotNull Collection<String> endWith, String regExp) {
        super(actionBuilder, classInstance, method, startWith, equalWith, endWith, regExp);
    }

    @Override
    public Message unpacker(@NotNull Update update) {
        return update.getEditedChannelPost();
    }

}
