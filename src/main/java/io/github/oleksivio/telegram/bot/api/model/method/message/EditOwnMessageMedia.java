package io.github.oleksivio.telegram.bot.api.model.method.message;

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.message.EditMessageMedia;
import io.github.oleksivio.telegram.bot.core.model.responses.MessageResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

public class EditOwnMessageMedia extends EditMessageMedia<Message> {

    public EditOwnMessageMedia(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return MessageResponse.class;
    }
}
