package ru.ioleksiv.telegram.bot.core.model.method.update;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getwebhookinfo">getWebhookInfo</a>
 */
public class GetWebhookInfo extends RunnableAction<WebhookInfo> {
    private static final String METHOD = "getWebhookInfo";

    protected GetWebhookInfo(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<WebhookInfo>> getResultWrapperClass() {
        return ResponseCollection.WebhookInfoResponse.class;
    }
}
