package ru.ioleksiv.telegram.bot.core.api;

import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.IAction;

public interface TelegramSender {
    void send(Iterable<IAction> actions);

}
