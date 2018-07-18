package ru.ioleksiv.telegram.bot.core.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.List;

public interface TelegramProcessor {

    @NotNull
    List<IAction> process(@Nullable Update update);

}
