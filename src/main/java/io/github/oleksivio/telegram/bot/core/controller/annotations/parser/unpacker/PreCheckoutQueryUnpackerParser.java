package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.receiver.PreCheckoutQueryReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery;

import java.util.Optional;

@Component
public class PreCheckoutQueryUnpackerParser extends UnpackerParser<PreCheckoutQueryReceiver, PreCheckoutQuery> {

    @Override
    public Class<PreCheckoutQueryReceiver> getAnnotationClass() {
        return PreCheckoutQueryReceiver.class;
    }

    @Override
    public UpdateUnpacker<PreCheckoutQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getPreCheckoutQuery()), PreCheckoutQuery.class);
    }
}
