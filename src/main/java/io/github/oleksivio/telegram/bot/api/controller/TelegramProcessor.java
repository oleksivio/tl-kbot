package io.github.oleksivio.telegram.bot.api.controller;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;

public interface TelegramProcessor {

    void receive(Update update);

}
