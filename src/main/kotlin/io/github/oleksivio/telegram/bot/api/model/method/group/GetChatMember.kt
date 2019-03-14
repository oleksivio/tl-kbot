package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.ChatMemberResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [getChatMember](https://core.telegram.org/bots/api.getchatmember)
 */
class GetChatMember(actionNetworker: ActionNetworker) : ChatAction<ChatMember>(METHOD, actionNetworker) {

    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    var userId: Long? = null

    override val resultWrapperClass = ChatMemberResponse::class

    companion object {
        private const val METHOD = "getChatMember"
    }

}
