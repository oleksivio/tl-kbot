package ru.ioleksiv.telegram.bot.api.model.method.update;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletewebhook">deleteWebhook</a>
 */
public class DeleteWebhook extends RunnableAction<Boolean> {
    private static final String METHOD = "deleteWebhook";

    public DeleteWebhook(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    @Override
    public DeleteWebhook setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
