package ru.ioleksiv.telegram.bot.api.model.method.message;

import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageMedia;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.MessageResponse;

public class EditOwnMessageMedia extends EditMessageMedia<Message> {

    public EditOwnMessageMedia(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return MessageResponse.class;
    }
}
