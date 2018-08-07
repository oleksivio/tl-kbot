package ru.ioleksiv.telegram.bot.api.model.method.message;

import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageText;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class EditOtherMessageText extends EditMessageText<Boolean> {
    public EditOtherMessageText(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
