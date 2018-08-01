package ru.ioleksiv.telegram.bot.core.api.model;

import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;

public interface TelegramUpdater {

    void process();

    void error(Update update, Exception onProcessException);
}
