package io.github.oleksivio.telegram.bot.api.model.method.location;

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.location.EditMessageLiveLocation;
import io.github.oleksivio.telegram.bot.core.model.responses.MessageResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

public class EditOwnMessageLiveLocation extends EditMessageLiveLocation<Message> {

    public EditOwnMessageLiveLocation(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return MessageResponse.class;
    }

}
