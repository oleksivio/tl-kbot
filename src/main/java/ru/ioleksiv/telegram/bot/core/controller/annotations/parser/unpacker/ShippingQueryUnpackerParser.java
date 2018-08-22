package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.ShippingQueryReceiver;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class ShippingQueryUnpackerParser extends UnpackerParser<ShippingQueryReceiver, ShippingQuery> {

    @Override
    public Class<ShippingQueryReceiver> getAnnotationClass() {
        return ShippingQueryReceiver.class;
    }

    @Override
    public UpdateUnpacker<ShippingQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getShippingQuery()), ShippingQuery.class);
    }
}
