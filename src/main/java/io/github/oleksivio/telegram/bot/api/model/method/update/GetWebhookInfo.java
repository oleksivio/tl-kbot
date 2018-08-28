package io.github.oleksivio.telegram.bot.api.model.method.update;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.WebhookInfoResponse;
import io.github.oleksivio.telegram.bot.api.model.objects.WebhookInfo;

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
        return WebhookInfoResponse.class;
    }

    @Override
    public GetWebhookInfo setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
