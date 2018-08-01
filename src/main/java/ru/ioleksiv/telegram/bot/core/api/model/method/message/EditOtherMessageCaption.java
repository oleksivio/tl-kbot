package ru.ioleksiv.telegram.bot.core.api.model.method.message;

import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageCaption;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class EditOtherMessageCaption extends EditMessageCaption<Boolean> {

    public EditOtherMessageCaption(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
