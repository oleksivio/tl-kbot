package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;

public class MessageUnpacker implements Unpacker<Message> {
    @Override
    public Message unpack(@NotNull Update update) {
        return update.getMessage();
    }
}
