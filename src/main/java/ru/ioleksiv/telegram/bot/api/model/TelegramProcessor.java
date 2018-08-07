package ru.ioleksiv.telegram.bot.api.model;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;

public interface TelegramProcessor {

    void receive(@Nullable Update update);

}
