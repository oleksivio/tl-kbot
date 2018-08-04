package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.UnionFilter;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

public class Handler<ARG> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    @NotNull
    private final Unpacker<ARG> unpacker;
    @NotNull
    private final UnionFilter<ARG> unionFilter;
    @NotNull
    private final Invoker invoker;

    public Handler(@NotNull Invoker invoker,
                   @NotNull Unpacker<ARG> unpacker,
                   @NotNull UnionFilter<ARG> unionFilter) {
        this.unpacker = unpacker;
        this.invoker = invoker;
        this.unionFilter = unionFilter;
    }


    public HandlerResult run(@Nullable Update update) {

        if (update == null) {
            // Not valid arguments
            return HandlerResult.pass();
        }
        ARG arg = unpacker.unpack(update);

        return invoker.invoke(update, arg);
    }

    public boolean isAcceptable(@Nullable Update update) {
        if (update == null) {
            return false;
        }

        ARG arg = unpacker.unpack(update);
        return arg != null && unionFilter.check(arg);
    }

}
