package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.receiver.CallbackQueryReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.std.CallbackQuery;

import java.util.Optional;

@Component
public class CallbackQueryUnpackerParser extends UnpackerParser<CallbackQueryReceiver, CallbackQuery> {

    @Override
    public Class<CallbackQueryReceiver> getAnnotationClass() {
        return CallbackQueryReceiver.class;
    }

    @Override
    public UpdateUnpacker<CallbackQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getCallbackQuery()), CallbackQuery.class);
    }

}
