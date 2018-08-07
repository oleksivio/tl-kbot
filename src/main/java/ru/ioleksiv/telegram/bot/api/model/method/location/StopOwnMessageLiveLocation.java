package ru.ioleksiv.telegram.bot.api.model.method.location;

import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.method.location.StopMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class StopOwnMessageLiveLocation extends StopMessageLiveLocation<Message> {
    public StopOwnMessageLiveLocation(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
