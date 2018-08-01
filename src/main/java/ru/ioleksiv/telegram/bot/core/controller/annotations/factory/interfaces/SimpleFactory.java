package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Optional;

public abstract class SimpleFactory<T extends Annotation> implements Factory {

    private final ActionBuilder actionBuilder;

    public SimpleFactory(ActionBuilder actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    @Override
    @NotNull
    public Optional<Handler> create(@NotNull Object classInstance,
                                    @NotNull Method method) {

        T annotationArgs = method.getAnnotation(getFactoryAnnotation());
        return mapper(annotationArgs, classInstance, method, actionBuilder);
    }

    protected abstract Class<T> getFactoryAnnotation();

    protected abstract Optional<Handler> mapper(@NotNull T annotationArgs,
                                                @NotNull Object classInstance,
                                                @NotNull Method method,
                                                @NotNull ActionBuilder actionBuilder);

    @Override
    public boolean hasAnnotated(Method method) {
        return method.isAnnotationPresent(getFactoryAnnotation());
    }
}
