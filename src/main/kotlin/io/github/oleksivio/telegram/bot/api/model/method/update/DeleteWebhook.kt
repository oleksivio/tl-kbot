package io.github.oleksivio.telegram.bot.api.model.method.update

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [deleteWebhook](https://core.telegram.org/bots/api.deletewebhook)
 */
class DeleteWebhook(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "deleteWebhook"
    }

}
