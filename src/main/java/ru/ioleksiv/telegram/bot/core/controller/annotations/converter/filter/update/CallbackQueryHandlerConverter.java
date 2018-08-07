package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.CallbackQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class CallbackQueryHandlerConverter extends UpdateHandlerConverter<CallbackQueryHandler, CallbackQuery> {

    @Override
    protected Class<CallbackQueryHandler> getFactoryAnnotation() {
        return CallbackQueryHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, CallbackQuery> getUnpacker() {
        return Update::getCallbackQuery;
    }

    @Override
    protected @NotNull Class<CallbackQuery> outClass() {
        return CallbackQuery.class;
    }

}
