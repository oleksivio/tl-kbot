package ru.ioleksiv.telegram.bot.core.api.model.method.update;

import ru.ioleksiv.telegram.bot.core.api.model.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#getwebhookinfo">getWebhookInfo</a>
 */
public class GetWebhookInfo extends RunnableAction<WebhookInfo> {
    private static final String METHOD = "getWebhookInfo";

    public GetWebhookInfo(Networker networker) {
        super(METHOD, networker);
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
