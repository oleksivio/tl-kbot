package ru.ioleksiv.telegram.bot.core.controller.handler.message.text;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.Message;

import java.lang.reflect.Method;
import java.util.Collection;

public class EditedMessageHandler extends TextHandler {

    public EditedMessageHandler(@NotNull Object classInstance,
                                @NotNull Method method,
                                @NotNull Collection<String> startWith,
                                @NotNull Collection<String> equalWith,
                                @NotNull Collection<String> endWith, String regExp) {
        super(classInstance, method, startWith, equalWith, endWith, regExp);
    }

    @Override
    public Message unpacker(@NotNull Update update) {
        return update.getEditedMessage();
    }

}
