package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.CallbackQuery;

public class CallbackQueryUnpacker implements Unpacker<CallbackQuery> {
    @Nullable
    @Override
    public CallbackQuery unpack(@NotNull Update update) {
        return update.getCallbackQuery();
    }
}
