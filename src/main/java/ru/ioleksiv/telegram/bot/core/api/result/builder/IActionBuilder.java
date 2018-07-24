package ru.ioleksiv.telegram.bot.core.api.result.builder;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;

public interface IActionBuilder {

    @NotNull
    IAction build();
}
