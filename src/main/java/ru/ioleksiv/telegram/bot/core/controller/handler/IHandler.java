package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.model.exceptions.InvalidInputException;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.List;

public interface IHandler {
    boolean isAcceptable(@Nullable Update update);

    @NotNull
    List<IAction> invoke(@Nullable Update update) throws InvalidInputException;

}
