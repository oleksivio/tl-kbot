package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class InlineQueryHandlerConverter extends UpdateHandlerConverter<InlineQueryHandler, InlineQuery> {

    @Override
    protected Class<InlineQueryHandler> getFactoryAnnotation() {
        return InlineQueryHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, InlineQuery> getUnpacker() {
        return Update::getInlineQuery;
    }

    @NotNull
    @Override
    public Class<InlineQuery> outClass() {
        return InlineQuery.class;
    }
}
