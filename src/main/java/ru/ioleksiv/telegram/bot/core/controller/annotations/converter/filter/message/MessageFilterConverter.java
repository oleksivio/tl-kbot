package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Layer;

import java.lang.annotation.Annotation;

public abstract class MessageFilterConverter<A extends Annotation, OUT> extends FilterConverter<A, Message, OUT> {

    @Override
    protected @NotNull Class<Message> inClass() {
        return Message.class;
    }

    @Override
    protected Layer getLevel() {
        return Layer.ARG_CLASS;
    }
}
