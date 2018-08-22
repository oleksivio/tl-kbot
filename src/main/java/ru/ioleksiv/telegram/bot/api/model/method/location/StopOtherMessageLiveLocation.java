package ru.ioleksiv.telegram.bot.api.model.method.location;

import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.location.StopMessageLiveLocation;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

public class StopOtherMessageLiveLocation extends StopMessageLiveLocation<Boolean> {
    public StopOtherMessageLiveLocation(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }
}
