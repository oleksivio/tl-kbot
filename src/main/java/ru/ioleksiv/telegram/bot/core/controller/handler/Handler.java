package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.Optional;

public class Handler<ARG extends ITelegram> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final Invoker<ARG> methodInvoker;
    @NotNull
    private final Checker<Update> updateChecker;
    @NotNull
    private final Unpacker<Update, ARG> updateUnpacker;

    public Handler(@NotNull Invoker<ARG> methodInvoker,
                   @NotNull Checker<Update> updateChecker,
                   @NotNull Unpacker<Update, ARG> updateUnpacker) {
        this.methodInvoker = methodInvoker;
        this.updateChecker = updateChecker;
        this.updateUnpacker = updateUnpacker;
    }

    public HandlerResult run(@Nullable Update update) {

        return Optional.ofNullable(update)
                .map(updateUnpacker::unpack)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(methodInvoker::run)
                .orElse(HandlerResult.pass());
    }

    public boolean hasSubscription(@Nullable Update update) {
        return updateChecker.check(update);
    }

}
