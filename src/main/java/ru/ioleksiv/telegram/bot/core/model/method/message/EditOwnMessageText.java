package ru.ioleksiv.telegram.bot.core.model.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

public class EditOwnMessageText extends EditMessageText<Message> {
    EditOwnMessageText(Networker networker) {
        super(networker);
    }

    @Override
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
