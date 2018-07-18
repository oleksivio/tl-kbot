package ru.ioleksiv.telegram.bot.core.api.actions;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;

import java.util.List;

public interface ActionBuilder {

    @NotNull
    List<IAction> build();

}
