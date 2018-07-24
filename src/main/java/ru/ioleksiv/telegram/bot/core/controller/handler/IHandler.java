package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

public interface IHandler {
    boolean isAcceptable(@Nullable Update update);

    @NotNull
    HandlerResult invoke(@Nullable Update update) ;

}
