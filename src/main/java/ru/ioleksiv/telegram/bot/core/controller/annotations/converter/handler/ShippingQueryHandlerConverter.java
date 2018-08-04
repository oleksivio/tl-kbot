package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import ru.ioleksiv.telegram.bot.core.api.annotations.handler.ShippingQueryHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.ShippingQueryUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class ShippingQueryHandlerConverter extends HandlerConverter<ShippingQueryHandler, ShippingQuery> {
    public ShippingQueryHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<ShippingQueryHandler> getFactoryAnnotation() {

        return ShippingQueryHandler.class;
    }

    @Override
    protected Unpacker<ShippingQuery> toUnpacker() {
        return new ShippingQueryUnpacker();
    }

    @Override
    public Class<ShippingQuery> getArgumentType() {
        return ShippingQuery.class;
    }
}
