package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.ResultInvoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.VoidInvoker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Optional;

@Controller
public class InvokerProducer {
    private final ActionBuilder actionBuilder;

    public InvokerProducer(ActionBuilder actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    public <ARG extends ITelegram> Optional<Invoker<ARG>> create(@NotNull Method method,
                                                                 @NotNull Object classInstance,
                                                                 @NotNull Class<ARG> argClass) {

        Class<?>[] methodArgsTypes = method.getParameterTypes();

        if (methodArgsTypes.length != 2) {
            // todo log message
            return Optional.empty();
        }

        if (!Objects.equals(methodArgsTypes[0], ActionBuilder.class)) {
            //todo log message
            return Optional.empty();
        }

        if (!Objects.equals(methodArgsTypes[1], argClass)) {
            //todo log message
            return Optional.empty();
        }

        Invoker<ARG> invoker = Objects.equals(method.getReturnType(), HandlerResult.class) ?
                new ResultInvoker<>(classInstance, method, actionBuilder)
                : new VoidInvoker<>(classInstance, method, actionBuilder);

        return Optional.of(invoker);

    }


}
