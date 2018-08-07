package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.PreCheckoutQueryHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class PreCheckoutQueryHandlerConverter extends UpdateHandlerConverter<PreCheckoutQueryHandler, PreCheckoutQuery> {

    @Override
    protected Class<PreCheckoutQueryHandler> getFactoryAnnotation() {
        return PreCheckoutQueryHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, PreCheckoutQuery> getUnpacker() {
        return Update::getPreCheckoutQuery;
    }

    @NotNull
    @Override
    public Class<PreCheckoutQuery> outClass() {
        return PreCheckoutQuery.class;
    }
}
