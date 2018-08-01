package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.lang.reflect.Method;
import java.util.Optional;

public interface Factory {
    @NotNull Optional<Handler> create(@NotNull Object classInstance,
                                      @NotNull Method method);

    boolean hasAnnotated(Method method);
}
