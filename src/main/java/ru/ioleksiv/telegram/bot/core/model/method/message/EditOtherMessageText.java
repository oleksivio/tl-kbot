package ru.ioleksiv.telegram.bot.core.model.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

public class EditOtherMessageText extends EditMessageText<Boolean> {
    EditOtherMessageText(Networker networker) {
        super(networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
