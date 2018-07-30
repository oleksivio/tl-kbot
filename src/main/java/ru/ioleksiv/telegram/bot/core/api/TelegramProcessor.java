package ru.ioleksiv.telegram.bot.core.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.objects.Update;

public interface TelegramProcessor {

    @NotNull
    HandlerResult process(@Nullable Update update);

}
