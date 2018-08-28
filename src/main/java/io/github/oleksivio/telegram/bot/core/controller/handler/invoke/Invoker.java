package io.github.oleksivio.telegram.bot.core.controller.handler.invoke;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Invoker<ARG extends ITelegram> {
    private static final Logger LOG = LoggerFactory.getLogger(Invoker.class);

    private final Method method;
    private final Object classInstance;

    Invoker(Object classInstance,
            Method method) {
        this.method = method;
        this.classInstance = classInstance;
    }

    public HandlerResult run(ARG argument) {

        try {
            return invoke(classInstance, method, argument);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Can't run ErrorResponse method " + method);
            LOG.error("", invalidBehaviorException);
            LOG.error("", e);
            throw invalidBehaviorException;

        }
        catch (ClassCastException ignored) {
            RuntimeException invalidBehaviorException =
                    new IllegalStateException("Invalid result type of method. "
                                                      + "HandlerResult or void was expected "
                                                      + method);
            LOG.error("", invalidBehaviorException);
            throw invalidBehaviorException;
        }

    }

    protected abstract HandlerResult invoke(Object classInstance,
                                            Method method,
                                            ARG argument) throws InvocationTargetException, IllegalAccessException;

}
