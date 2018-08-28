package io.github.oleksivio.telegram.bot.api.model.method.message;

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.message.EditMessageReplyMarkup;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

public class EditOtherMessageReplyMarkup extends EditMessageReplyMarkup<Boolean> {

    public EditOtherMessageReplyMarkup(ActionNetworker actionNetworker) {
        super(actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

}
