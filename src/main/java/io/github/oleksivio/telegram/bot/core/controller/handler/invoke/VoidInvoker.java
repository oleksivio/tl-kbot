package io.github.oleksivio.telegram.bot.core.controller.handler.invoke;

import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VoidInvoker<ARG extends ITelegram> extends Invoker<ARG> {
    public VoidInvoker(Object classInstance,
                       Method method) {
        super(classInstance, method);
    }

    @Override
    protected HandlerResult invoke(Object classInstance,
                                   Method method,
                                   ARG argument)
            throws InvocationTargetException, IllegalAccessException {
        method.invoke(classInstance, argument);
        return HandlerResult.success();
    }
}