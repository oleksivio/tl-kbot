package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.InlineQueryReceiver;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class InlineQueryUnpackerParser extends UnpackerParser<InlineQueryReceiver, InlineQuery> {

    @Override
    public Class<InlineQueryReceiver> getAnnotationClass() {
        return InlineQueryReceiver.class;
    }

    @Override
    public UpdateUnpacker<InlineQuery> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getInlineQuery()), InlineQuery.class);
    }
}
