package io.github.oleksivio.telegram.bot.api.model.method.update

import io.github.oleksivio.telegram.bot.api.model.objects.WebhookInfo
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.WebhookInfoResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getWebhookInfo](https://core.telegram.org/bots/api.getwebhookinfo)
 */
class GetWebhookInfo(actionNetworker: ActionNetworker) : RunnableAction<WebhookInfo>(METHOD, actionNetworker) {

    override val resultWrapperClass = WebhookInfoResponse::class

    companion object {
        private const val METHOD = "getWebhookInfo"
    }

}
