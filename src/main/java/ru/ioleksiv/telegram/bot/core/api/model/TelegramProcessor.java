package ru.ioleksiv.telegram.bot.core.api.model;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;

public interface TelegramProcessor {

    void process(@Nullable Update update);

}
