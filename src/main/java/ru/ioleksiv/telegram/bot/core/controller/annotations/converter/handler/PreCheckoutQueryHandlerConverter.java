package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import ru.ioleksiv.telegram.bot.core.api.annotations.handler.PreCheckoutQueryHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.payments.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.PreCheckoutQueryUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class PreCheckoutQueryHandlerConverter extends HandlerConverter<PreCheckoutQueryHandler, PreCheckoutQuery> {
    public PreCheckoutQueryHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<PreCheckoutQueryHandler> getFactoryAnnotation() {
        return PreCheckoutQueryHandler.class;
    }

    @Override
    protected Unpacker<PreCheckoutQuery> toUnpacker() {
        return new PreCheckoutQueryUnpacker();
    }

    @Override
    public Class<PreCheckoutQuery> getArgumentType() {
        return PreCheckoutQuery.class;
    }
}
