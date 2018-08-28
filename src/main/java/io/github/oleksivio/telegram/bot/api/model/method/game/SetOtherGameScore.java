package io.github.oleksivio.telegram.bot.api.model.method.game;

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.game.SetGameScore;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

public class SetOtherGameScore extends SetGameScore<Boolean> {
    public SetOtherGameScore(ActionNetworker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }
}
