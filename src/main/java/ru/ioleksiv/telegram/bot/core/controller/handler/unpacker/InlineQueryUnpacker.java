package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.inline.InlineQuery;

public class InlineQueryUnpacker implements Unpacker<InlineQuery> {
    @Override
    public InlineQuery unpack(@NotNull Update update) {
        return update.getInlineQuery();
    }
}
