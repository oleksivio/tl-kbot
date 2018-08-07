package ru.ioleksiv.telegram.bot.api.model.method.location;

import ru.ioleksiv.telegram.bot.core.model.method.location.StopMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class StopOtherMessageLiveLocation extends StopMessageLiveLocation<Boolean> {
    public StopOtherMessageLiveLocation(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
