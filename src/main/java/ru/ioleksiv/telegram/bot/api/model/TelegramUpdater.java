package ru.ioleksiv.telegram.bot.api.model;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;

public interface TelegramUpdater {

    void process();

    void error(Update update, Exception onProcessException);
}
