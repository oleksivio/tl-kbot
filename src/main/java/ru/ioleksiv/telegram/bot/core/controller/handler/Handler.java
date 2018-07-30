package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.objects.Update;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class Handler<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @Nullable
    private final Method method;
    @Nullable
    private final Object classInstance;

    protected Handler(@Nullable Object classInstance, @Nullable Method method) {
        this.classInstance = classInstance;
        this.method = method;

    }

    @NotNull
    public HandlerResult invoke(@Nullable Update update) {

        if (classInstance == null || method == null || update == null) {
            // Not valid arguments
            return HandlerResult.noAction();
        }

        try {

            Class<?>[] methodArgsTypes = method.getParameterTypes();

            T methodParameter = unpacker(update);

            if (methodParameter != null
                    && methodArgsTypes.length == 1
                    && Objects.equals(methodArgsTypes[0], methodParameter.getClass())) {

                return (HandlerResult) method.invoke(classInstance, methodParameter);
            }

        }
        catch (IllegalAccessException | InvocationTargetException e) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Can't invoke response method " + method);
            LOGGER.error("", invalidBehaviorException);
            LOGGER.error("", e);
            throw invalidBehaviorException;

        }
        catch (ClassCastException ignored) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Invalid result type of method List<IAction> was expected " + method);
            LOGGER.error("", invalidBehaviorException);
            throw invalidBehaviorException;
        }

        return HandlerResult.noAction();

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
