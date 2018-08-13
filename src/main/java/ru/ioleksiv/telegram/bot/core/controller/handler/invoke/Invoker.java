package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Invoker<ARG extends ITelegram> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final Method method;
    @NotNull
    private final Object classInstance;
    @NotNull
    private final ActionBuilder actionBuilder;

    Invoker(@NotNull Object classInstance,
            @NotNull Method method,
            @NotNull ActionBuilder actionBuilder) {
        this.method = method;
        this.classInstance = classInstance;
        this.actionBuilder = actionBuilder;
    }

    @NotNull
    public HandlerResult run(@NotNull ARG argument) {

        try {
            return invoke(classInstance, method, actionBuilder, argument);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Can't run ErrorResponse method " + method);
            LOGGER.error("", invalidBehaviorException);
            LOGGER.error("", e);
            throw invalidBehaviorException;

        }
        catch (ClassCastException ignored) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Invalid result type of method. HandlerResult or void was expected " + method);
            LOGGER.error("", invalidBehaviorException);
            throw invalidBehaviorException;
        }

    }

    protected abstract HandlerResult invoke(Object classInstance,
                                            Method method,
                                            ActionBuilder actionBuilder,
                                            ARG argument) throws InvocationTargetException, IllegalAccessException;

}
