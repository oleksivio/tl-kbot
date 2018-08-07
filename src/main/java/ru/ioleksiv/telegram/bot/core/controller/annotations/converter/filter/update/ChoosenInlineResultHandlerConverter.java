package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.ChosenInlineResultHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class ChoosenInlineResultHandlerConverter extends UpdateHandlerConverter<ChosenInlineResultHandler, ChosenInlineResult> {

    @Override
    protected Class<ChosenInlineResultHandler> getFactoryAnnotation() {
        return ChosenInlineResultHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, ChosenInlineResult> getUnpacker() {
        return Update::getChoosenInlineResult;
    }

    @Override
    @NotNull
    public Class<ChosenInlineResult> outClass() {
        return ChosenInlineResult.class;
    }
}
