package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class FilterConverter<T extends Annotation, ARG> {

    private final ActionBuilder actionBuilder;

    public FilterConverter(ActionBuilder actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    public boolean hasAnnotated(Method method) {
        return method.isAnnotationPresent(getFactoryAnnotation());
    }

    public Filter<ARG> toChecker(@NotNull Method method) {
        T annotation = method.getAnnotation(getFactoryAnnotation());
        return toChecker(annotation);
    }

    protected abstract Filter<ARG> toChecker(T annotation);

    protected abstract Class<T> getFactoryAnnotation();

    public abstract Class<ARG> getFilterInputClass();

}
