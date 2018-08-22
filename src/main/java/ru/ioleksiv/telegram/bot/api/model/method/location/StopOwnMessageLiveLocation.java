package ru.ioleksiv.telegram.bot.api.model.method.location;

import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.location.StopMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.MessageResponse;

public class StopOwnMessageLiveLocation extends StopMessageLiveLocation<Message> {
    public StopOwnMessageLiveLocation(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return MessageResponse.class;
    }
}
