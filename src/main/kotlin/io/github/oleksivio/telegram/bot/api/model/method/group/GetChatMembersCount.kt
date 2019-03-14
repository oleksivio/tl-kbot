package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.IntegerResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [getChatMembersCount](https://core.telegram.org/bots/api.getchatmemberscount)
 */
class GetChatMembersCount(actionNetworker: ActionNetworker) : ChatAction<Int>(METHOD, actionNetworker) {

    override val resultWrapperClass = IntegerResponse::class

    companion object {
        private const val METHOD = "getChatMembersCount"
    }

}
