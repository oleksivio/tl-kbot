package ru.ioleksiv.telegram.bot.core.controller.annotations.factory;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.Factory;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.SimpleFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.lang.reflect.Method;
import java.util.Optional;

public final class HandlerFactory {
    private final Iterable<SimpleFactory> factories;

    public HandlerFactory(Iterable<SimpleFactory> factories) {
        this.factories = factories;
    }

    @NotNull
    public Optional<Handler> create(@NotNull Object classInstance,
                                    @NotNull Method method) {

        for (Factory factory : factories) {
            if (factory.hasAnnotated(method)) {
                return factory.create(classInstance, method);
            }

        }

        return Optional.empty();
    }

}
