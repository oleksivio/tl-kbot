package ru.ioleksiv.telegram.bot.api.model.method.update;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getwebhookinfo">getWebhookInfo</a>
 */
public class GetWebhookInfo extends RunnableAction<WebhookInfo> {
    private static final String METHOD = "getWebhookInfo";

    public GetWebhookInfo(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<WebhookInfo>> getResultWrapperClass() {
        return ResponseCollection.WebhookInfoResponse.class;
    }

    @Override
    public GetWebhookInfo setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
