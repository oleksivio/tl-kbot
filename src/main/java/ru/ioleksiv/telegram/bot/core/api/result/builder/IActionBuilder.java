package ru.ioleksiv.telegram.bot.core.api.result.builder;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IAction;

public interface IActionBuilder {

    @NotNull
    IAction build();
}
