package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.ShippingQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class ShippingQueryHandlerConverter extends UpdateHandlerConverter<ShippingQueryHandler, ShippingQuery> {

    @Override
    protected Class<ShippingQueryHandler> getFactoryAnnotation() {
        return ShippingQueryHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, ShippingQuery> getUnpacker() {
        return Update::getShippingQuery;
    }

    @NotNull
    @Override
    public Class<ShippingQuery> outClass() {
        return ShippingQuery.class;
    }
}
