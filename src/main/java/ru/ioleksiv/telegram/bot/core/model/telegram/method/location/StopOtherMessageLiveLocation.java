package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

public class StopOtherMessageLiveLocation  extends StopMessageLiveLocation<Boolean > {
    public StopOtherMessageLiveLocation(Networker networker) {
        super(networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
