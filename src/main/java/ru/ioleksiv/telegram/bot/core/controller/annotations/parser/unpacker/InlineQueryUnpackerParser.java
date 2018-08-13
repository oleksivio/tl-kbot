package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class InlineQueryUnpackerParser extends UnpackerParser<InlineQueryHandler, InlineQuery> {

    @Override
    public Class<InlineQueryHandler> getAnnotationClass() {
        return InlineQueryHandler.class;
    }

    @Override
    public UpdateUnpacker<InlineQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getInlineQuery()), InlineQuery.class);
    }
}
