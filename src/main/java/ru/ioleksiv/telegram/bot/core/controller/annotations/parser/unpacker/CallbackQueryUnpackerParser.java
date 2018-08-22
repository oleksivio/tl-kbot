package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.CallbackQueryReceiver;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

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
