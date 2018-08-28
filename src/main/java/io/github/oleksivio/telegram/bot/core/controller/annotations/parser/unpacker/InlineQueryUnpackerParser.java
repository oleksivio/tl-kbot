package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.receiver.InlineQueryReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery;

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
