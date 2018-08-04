package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.model.objects.payments.ShippingQuery;

public class ShippingQueryUnpacker implements Unpacker<ShippingQuery> {
    @Override
    public ShippingQuery unpack(@NotNull Update update) {
        return update.getShippingQuery();
    }
}
