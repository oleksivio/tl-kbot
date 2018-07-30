package ru.ioleksiv.telegram.bot.core.controller.network;

import ru.ioleksiv.telegram.bot.core.api.TelegramSender;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.IAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

public class Sender implements TelegramSender {
    private final Networker networker;

    //todo add logic with pause between messages
    public Sender(Networker networker) {
        this.networker = networker;
    }

    @Override
    public void send(Iterable<IAction> actions) {

        for (IAction action : actions) {
            networker.run(action, CommonResponse.class);
        }
    }

}
