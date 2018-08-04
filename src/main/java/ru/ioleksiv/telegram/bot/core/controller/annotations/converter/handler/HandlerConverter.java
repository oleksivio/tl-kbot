package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.UnionFilter;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class HandlerConverter<T extends Annotation, ARG> {

    private final ActionBuilder actionBuilder;

    public HandlerConverter(ActionBuilder actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    @NotNull
    public Handler<ARG> create(@NotNull Object classInstance,
                               @NotNull Method method,
                               @NotNull Iterable<Filter<ARG>> methodFilters) {

        Invoker invoker = new Invoker(method, classInstance, actionBuilder);

        Unpacker<ARG> unpacker = toUnpacker();

        UnionFilter<ARG> argUnionFilter = new UnionFilter<>();

        for (Filter<ARG> filter : methodFilters) {
            argUnionFilter.add(filter);
        }

        return new Handler<>(invoker, unpacker, argUnionFilter);
    }

    protected abstract Class<T> getFactoryAnnotation();

    protected abstract Unpacker<ARG> toUnpacker();

    public boolean hasAnnotated(Method method) {
        return method.isAnnotationPresent(getFactoryAnnotation());
    }

    public abstract Class<ARG> getArgumentType();

}
