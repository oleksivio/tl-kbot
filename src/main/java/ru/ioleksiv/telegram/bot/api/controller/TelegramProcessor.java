package ru.ioleksiv.telegram.bot.api.controller;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;

public interface TelegramProcessor {

    void receive(Update update);

}
