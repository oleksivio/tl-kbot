package ru.ioleksiv.telegram.bot.core.api.model.method.game;

import ru.ioleksiv.telegram.bot.core.model.method.game.SetGameScore;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class SetOtherGameScore extends SetGameScore<Boolean> {
    public SetOtherGameScore(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
