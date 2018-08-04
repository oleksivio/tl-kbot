package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import ru.ioleksiv.telegram.bot.core.api.annotations.handler.CallbackQueryHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.CallbackQueryUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class CallbackQueryHandlerConverter extends HandlerConverter<CallbackQueryHandler, CallbackQuery> {
    public CallbackQueryHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<CallbackQueryHandler> getFactoryAnnotation() {
        return CallbackQueryHandler.class;
    }

    @Override
    protected Unpacker<CallbackQuery> toUnpacker() {
        return new CallbackQueryUnpacker();
    }

    @Override
    public Class<CallbackQuery> getArgumentType() {
        return CallbackQuery.class;
    }
}
