package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.api.exceptions.InvalidInputException;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class AbstractInvokeHandler implements IHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractInvokeHandler.class);

    @Nullable
    private final Method mMethod;
    @Nullable
    private final Object mClassInstance;

    protected AbstractInvokeHandler(@Nullable Object classInstance, @Nullable Method method) {
        mClassInstance = classInstance;
        mMethod = method;

    }

    @Override
    @NotNull
    public List<IAction> invoke(@Nullable Update update) throws InvalidInputException {

        if (mClassInstance == null || mMethod == null || update == null) {
            // Not valid arguments
            return Collections.emptyList();
        }

        try {

            Class<?>[] methodArgsTypes = mMethod.getParameterTypes();

            Object methodParameter = unpackMethodParameter(update);

            if (methodParameter != null
                    && methodArgsTypes.length == 1
                    && Objects.equals(methodArgsTypes[0], methodParameter.getClass())) {

                return (List<IAction>) mMethod.invoke(mClassInstance, methodParameter);
            }

        }
        catch (IllegalAccessException | InvocationTargetException e) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Can't invoke response method " + mMethod);
            LOGGER.error("", invalidBehaviorException);
            LOGGER.error("", e);
            throw invalidBehaviorException;

        }
        catch (ClassCastException ignored) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Invalid result type of method List<IAction> was expected " + mMethod);
            LOGGER.error("", invalidBehaviorException);
            throw invalidBehaviorException;
        }

        return Collections.emptyList();

    }

    @Nullable
    protected abstract ITelegram unpackMethodParameter(@Nullable Update update);

}
