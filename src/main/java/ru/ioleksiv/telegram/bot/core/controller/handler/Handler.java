package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class Handler {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final MethodInvoker methodInvoker;
    @NotNull
    private final Checker<Update> updateChecker;
    @NotNull
    private final Unpacker<Update, ?> updateUnpacker;

    public Handler(@NotNull MethodInvoker methodInvoker,
                   @NotNull Checker<Update> updateChecker,
                   @NotNull Unpacker<Update, ?> updateUnpacker) {
        this.methodInvoker = methodInvoker;
        this.updateChecker = updateChecker;
        this.updateUnpacker = updateUnpacker;
    }

    public HandlerResult run(@Nullable Update update) {

        if (update == null) {
            // Not valid arguments
            return HandlerResult.pass();
        }

        Object arg = updateUnpacker.unpack(update);
        return methodInvoker.invoke(arg);
    }

    public boolean hasSubscription(@Nullable Update update) {
        return updateChecker.check(update);
    }

}
