package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.ResultInvoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.VoidInvoker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;

@Controller
public class InvokerProducer {
    private static final Logger LOG = LoggerFactory.getLogger(InvokerProducer.class);

    public <ARG extends ITelegram> Optional<Invoker<ARG>> create(Method method,
                                                                 Object classInstance,
                                                                 Class<ARG> argClass) {

        Class<?>[] methodArgsTypes = method.getParameterTypes();

        if (methodArgsTypes.length != 1) {
            LOG.error(" Invalid parameter count for method " + method);
            return Optional.empty();
        }

        if (!Objects.equals(methodArgsTypes[0], argClass)) {
            LOG.error(" Invalid parameter type for method " + method);
            return Optional.empty();
        }

        Invoker<ARG> invoker = Objects.equals(method.getReturnType(), HandlerResult.class) ?
                new ResultInvoker<>(classInstance, method)
                : new VoidInvoker<>(classInstance, method);

        return Optional.of(invoker);

    }

}
