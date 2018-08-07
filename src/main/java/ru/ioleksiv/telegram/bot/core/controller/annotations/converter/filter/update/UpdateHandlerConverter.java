package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Layer;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;

import java.lang.annotation.Annotation;
import java.util.Objects;

public abstract class UpdateHandlerConverter<A extends Annotation, OUT> extends FilterConverter<A, Update, OUT> {

    @Override
    @NotNull
    protected Checker<OUT> createChecker(A annotation) {
        return Objects::nonNull;
    }

    @Override
    @NotNull
    protected Class<Update> inClass() {
        return Update.class;
    }

    @Override
    protected Layer getLevel() {
        return Layer.UPDATE;
    }

}
