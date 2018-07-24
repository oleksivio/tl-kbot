package ru.ioleksiv.telegram.bot.core.api;

import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IAction;

public interface TelegramSender {
    void send(Iterable<IAction> actions);

}
