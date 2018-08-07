package ru.ioleksiv.telegram.bot.core.controller.annotations.converter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.Filter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Layer;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class FilterConverter<A extends Annotation, IN, OUT> {

    public Filter<IN,OUT> createFilter(Method method) {
        A annotation = method.getAnnotation(getFactoryAnnotation());
        Checker<OUT> checker = createChecker(annotation);

        return new Filter<>(getUnpacker(), checker, outClass(), inClass(), getLevel());
    }

    protected abstract Class<A> getFactoryAnnotation();

    @NotNull
    protected abstract Checker<OUT> createChecker(A annotation);

    @Nullable
    public abstract Unpacker<IN, OUT> getUnpacker();

    @NotNull
    protected abstract Class<OUT> outClass();

    @NotNull
    protected abstract Class<IN> inClass();

    protected abstract Layer getLevel();

    public boolean canParse(Method method) {
        return method.isAnnotationPresent(getFactoryAnnotation());
    }
}
