package ru.ioleksiv.telegram.bot.api.model.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.message.EditMessageReplyMarkup;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

public class EditOtherMessageReplyMarkup extends EditMessageReplyMarkup<Boolean> {

    public EditOtherMessageReplyMarkup(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

}
