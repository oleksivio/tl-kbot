package ru.ioleksiv.telegram.bot.api.model.method.message;

import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageCaption;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class EditOwnMessageCaption extends EditMessageCaption<Message> {

    public EditOwnMessageCaption(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
