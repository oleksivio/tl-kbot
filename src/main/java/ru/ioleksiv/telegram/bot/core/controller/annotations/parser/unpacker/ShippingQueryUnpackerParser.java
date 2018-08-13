package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.ShippingQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class ShippingQueryUnpackerParser extends UnpackerParser<ShippingQueryHandler, ShippingQuery> {

    @Override
    public Class<ShippingQueryHandler> getAnnotationClass() {
        return ShippingQueryHandler.class;
    }

    @Override
    public UpdateUnpacker<ShippingQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getShippingQuery()), ShippingQuery.class);
    }
}
