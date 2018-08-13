package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.PreCheckoutQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class PreCheckoutQueryUnpackerParser extends UnpackerParser<PreCheckoutQueryHandler, PreCheckoutQuery> {

    @Override
    public Class<PreCheckoutQueryHandler> getAnnotationClass() {
        return PreCheckoutQueryHandler.class;
    }

    @Override
    public UpdateUnpacker<PreCheckoutQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getPreCheckoutQuery()), PreCheckoutQuery.class);
    }
}
