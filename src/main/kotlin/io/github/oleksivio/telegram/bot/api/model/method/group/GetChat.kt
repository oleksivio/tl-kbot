package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.ChatResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [getChat](https://core.telegram.org/bots/api.getchat)
 */
class GetChat(actionNetworker: ActionNetworker) : ChatAction<Chat>(METHOD, actionNetworker) {

    override val resultWrapperClass = ChatResponse::class

    companion object {
        private const val METHOD = "getChat"
    }

}
