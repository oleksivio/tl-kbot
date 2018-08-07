package ru.ioleksiv.telegram.bot.api.model.method.message;

import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageMedia;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public class EditOtherMessageMedia extends EditMessageMedia<Boolean> {

    public EditOtherMessageMedia(Networker networker) {
        super(networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
