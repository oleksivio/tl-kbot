package io.github.oleksivio.telegram.bot.api.controller;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;

public interface TelegramUpdater {

    void longPolling();

    void error(Update update, Exception onProcessException);
}
