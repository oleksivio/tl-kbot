package ru.ioleksiv.telegram.bot.core.model.telegram.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

public class EditOtherMessageReplyMarkup  extends EditMessageReplyMarkup<Boolean > {

    EditOtherMessageReplyMarkup(Networker networker) {
        super(networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
