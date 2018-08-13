package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.CallbackQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class CallbackQueryUnpackerParser extends UnpackerParser<CallbackQueryHandler, CallbackQuery> {

    @Override
    public Class<CallbackQueryHandler> getAnnotationClass() {
        return CallbackQueryHandler.class;
    }

    @Override
    public UpdateUnpacker<CallbackQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getCallbackQuery()), CallbackQuery.class);
    }

}
