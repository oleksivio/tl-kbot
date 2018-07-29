package ru.ioleksiv.telegram.bot.core.model.telegram.method.update;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.WebhookInfo;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

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
