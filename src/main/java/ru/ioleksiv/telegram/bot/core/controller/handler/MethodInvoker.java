package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class MethodInvoker {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final Method method;
    @NotNull
    private final Object classInstance;
    @NotNull
    private final ActionBuilder actionBuilder;

    public MethodInvoker(@NotNull Method method,
                         @NotNull Object classInstance,
                         @NotNull ActionBuilder actionBuilder) {
        this.method = method;
        this.classInstance = classInstance;
        this.actionBuilder = actionBuilder;
    }

    @NotNull
    HandlerResult invoke(@Nullable Object methodParameter) {

        try {

            Class<?>[] methodArgsTypes = method.getParameterTypes();

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
}
