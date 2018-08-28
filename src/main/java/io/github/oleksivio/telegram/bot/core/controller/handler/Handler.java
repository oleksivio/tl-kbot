package io.github.oleksivio.telegram.bot.core.controller.handler;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.invoke.Invoker;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.Unpacker;
import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.util.Optional;

public class Handler<ARG extends ITelegram> {

    private final Invoker<ARG> methodInvoker;

    private final Validator<Update> updateValidator;

    private final Unpacker<Update, ARG> updateUnpacker;

    public Handler(Invoker<ARG> methodInvoker,
                   Validator<Update> updateValidator,
                   Unpacker<Update, ARG> updateUnpacker) {
        this.methodInvoker = methodInvoker;
        this.updateValidator = updateValidator;
        this.updateUnpacker = updateUnpacker;
    }

    public HandlerResult run(Update update) {

        return Optional.ofNullable(update)
                .map(updateUnpacker::unpack)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(methodInvoker::run)
                .orElse(HandlerResult.pass());
    }

    public boolean hasSubscription(Update update) {
        return updateValidator.check(update);
    }

}
