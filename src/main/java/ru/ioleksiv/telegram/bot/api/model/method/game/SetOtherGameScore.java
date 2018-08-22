package ru.ioleksiv.telegram.bot.api.model.method.game;

import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.game.SetGameScore;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

public class SetOtherGameScore extends SetGameScore<Boolean> {
    public SetOtherGameScore(ActionNetworker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }
}
