package ru.ioleksiv.telegram.bot.api.model.method.update;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletewebhook">deleteWebhook</a>
 */
public class DeleteWebhook extends RunnableAction<Boolean> {
    private static final String METHOD = "deleteWebhook";

    public DeleteWebhook(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public DeleteWebhook setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
