package ru.ioleksiv.telegram.bot.core.api.builder;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.file.GetFile;
import ru.ioleksiv.telegram.bot.core.model.method.file.SendPhotoFile;
import ru.ioleksiv.telegram.bot.core.model.method.location.EditOwnMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.SendLocation;
import ru.ioleksiv.telegram.bot.core.model.method.location.SendVenue;
import ru.ioleksiv.telegram.bot.core.model.method.message.DeleteMessage;
import ru.ioleksiv.telegram.bot.core.model.method.message.ForwardMessage;
import ru.ioleksiv.telegram.bot.core.model.method.message.SendMessage;

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

    public DeleteMessage deleteMessage() {
        return new DeleteMessage(networker);
    }

    public SendLocation sendLocation() {
        return new SendLocation(networker);
    }

    public EditOwnMessageLiveLocation editBotMessageLiveLocation() {
        return new EditOwnMessageLiveLocation(networker);
    }

    public SendVenue sendVenue() {
        return new SendVenue(networker);
    }

    public SendPhotoFile sendPhotoFile() {
        return new SendPhotoFile(networker);
    }

    public GetFile getFile() {
        return new GetFile(networker);
    }

}
