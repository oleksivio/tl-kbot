package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.ChatMembersResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [getChatAdministrators](https://core.telegram.org/bots/api.getchatadministrators)
 */
class GetChatAdministrators(actionNetworker: ActionNetworker) : ChatAction<List<ChatMember>>(METHOD, actionNetworker) {
    override val resultWrapperClass = ChatMembersResponse::class

    companion object {
        private const val METHOD = "getChatAdministrators"
    }

}
