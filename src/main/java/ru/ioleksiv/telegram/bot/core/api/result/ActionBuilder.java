package ru.ioleksiv.telegram.bot.core.api.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.SendMessage;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;

public class ActionBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(ActionBuilder.class);

    private final Networker networker;

    public ActionBuilder(Networker networker) {
        this.networker = networker;
    }


    public SendMessage message(){
        return new SendMessage(networker);
    }
}
