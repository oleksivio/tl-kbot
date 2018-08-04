package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.payments.PreCheckoutQuery;

public class PreCheckoutQueryUnpacker implements Unpacker<PreCheckoutQuery> {
    @Nullable
    @Override
    public PreCheckoutQuery unpack(@NotNull Update update) {
        return update.getPreCheckoutQuery();
    }
}
