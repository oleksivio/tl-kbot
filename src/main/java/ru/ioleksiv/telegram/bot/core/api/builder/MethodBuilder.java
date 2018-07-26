package ru.ioleksiv.telegram.bot.core.api.builder;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.files.GetFile;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.location.EditOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.location.SendLocation;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.location.SendVenue;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.message.DeleteMessage;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.message.ForwardMessage;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.message.SendMessage;

public class MethodBuilder {
    private final Networker networker;

    public MethodBuilder(Networker networker) {
        this.networker = networker;
    }


    public SendMessage sendMessage() {
        return new SendMessage(networker);
    }

    public ForwardMessage forwardMessage() {
        return new ForwardMessage(networker);
    }

    public DeleteMessage deleteMessage(){
        return new DeleteMessage(networker);
    }

    public SendLocation sendLocation(){
        return new SendLocation(networker);
    }

    public EditOwnMessageLiveLocation editBotMessageLiveLocation(){
        return new EditOwnMessageLiveLocation(networker);
    }

    public SendVenue sendVenue(){
        return new SendVenue(networker);
    }

    public GetFile createGetFile() {
        return new GetFile(networker);
    }

}
