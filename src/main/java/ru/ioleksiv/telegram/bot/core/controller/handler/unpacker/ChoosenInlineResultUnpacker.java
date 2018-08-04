package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.inline.ChosenInlineResult;

public class ChoosenInlineResultUnpacker implements Unpacker<ChosenInlineResult> {
    @Override
    public ChosenInlineResult unpack(@NotNull Update update) {
        return update.getChoosenInlineResult();
    }
}
