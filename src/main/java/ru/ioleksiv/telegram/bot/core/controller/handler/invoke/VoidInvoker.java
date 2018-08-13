package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VoidInvoker<ARG extends ITelegram> extends Invoker<ARG> {
    public VoidInvoker(@NotNull Object classInstance,
                       @NotNull Method method,
                       @NotNull ActionBuilder actionBuilder) {
        super(classInstance, method, actionBuilder);
    }

    @Override
    protected HandlerResult invoke(Object classInstance,
                                   Method method,
                                   ActionBuilder actionBuilder,
                                   ARG argument)
            throws InvocationTargetException, IllegalAccessException {
        method.invoke(classInstance, actionBuilder, argument);
        return HandlerResult.success();
    }
}
