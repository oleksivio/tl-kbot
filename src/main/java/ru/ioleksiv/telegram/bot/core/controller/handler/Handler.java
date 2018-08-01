package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class Handler<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final Method method;
    @NotNull
    private final Object classInstance;
    @NotNull
    private final ActionBuilder actionBuilder;

    protected Handler(@NotNull ActionBuilder actionBuilder, @NotNull Object classInstance,
                      @NotNull Method method) {
        this.classInstance = classInstance;
        this.method = method;
        this.actionBuilder = actionBuilder;
    }

    @NotNull
    public HandlerResult invoke(@Nullable Update update) {

        if (update == null) {
            // Not valid arguments
            return HandlerResult.pass();
        }

        try {

            Class<?>[] methodArgsTypes = method.getParameterTypes();

            T methodParameter = unpacker(update);

            // fixME reffffucktor
            if (methodParameter != null
                    && methodArgsTypes.length == 2
                    && Objects.equals(methodArgsTypes[0], ActionBuilder.class)
                    && Objects.equals(methodArgsTypes[1], methodParameter.getClass())) {

                if (Objects.equals(method.getReturnType(), HandlerResult.class)) {
                    return (HandlerResult) method.invoke(classInstance, actionBuilder, methodParameter);
                }
                else {
                    method.invoke(classInstance, actionBuilder, methodParameter);
                    return HandlerResult.success();
                }

            }

        }
        catch (IllegalAccessException | InvocationTargetException e) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Can't invoke ErrorResponse method " + method);
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

        return HandlerResult.pass();

    }

    @Nullable
    protected abstract T unpacker(@NotNull Update update);

    public boolean isAcceptable(@Nullable Update update) {
        if (update == null) {
            return false;
        }

        T arg = unpacker(update);
        return arg != null && checker(arg);
    }

    protected abstract boolean checker(@NotNull T argument);

}
