package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import ru.ioleksiv.telegram.bot.core.api.annotations.handler.ChosenInlineResultHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.ChoosenInlineResultUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class ChoosenInlineResultHandlerConverter extends HandlerConverter<ChosenInlineResultHandler, ChosenInlineResult> {
    public ChoosenInlineResultHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<ChosenInlineResultHandler> getFactoryAnnotation() {
        return ChosenInlineResultHandler.class;
    }

    @Override
    protected Unpacker<ChosenInlineResult> toUnpacker() {
        return new ChoosenInlineResultUnpacker();
    }

    @Override
    public Class<ChosenInlineResult> getArgumentType() {
        return ChosenInlineResult.class;
    }
}
