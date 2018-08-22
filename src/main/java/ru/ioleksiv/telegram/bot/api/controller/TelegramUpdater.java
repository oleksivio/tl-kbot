package ru.ioleksiv.telegram.bot.api.controller;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;

public interface TelegramUpdater {

    void longPolling();

    void error(Update update, Exception onProcessException);
}
