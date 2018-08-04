package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import ru.ioleksiv.telegram.bot.core.api.annotations.handler.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.InlineQueryUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class InlineQueryHandlerConverter extends HandlerConverter<InlineQueryHandler, InlineQuery> {
    public InlineQueryHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<InlineQueryHandler> getFactoryAnnotation() {
        return InlineQueryHandler.class;
    }

    @Override
    protected Unpacker<InlineQuery> toUnpacker() {
        return new InlineQueryUnpacker();
    }

    @Override
    public Class<InlineQuery> getArgumentType() {
        return InlineQuery.class;
    }
}
