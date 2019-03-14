package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [kickChatMember](https://core.telegram.org/bots/api.kickchatmember)
 */
class KickChatMember(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {

    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * until_date Integer Optional Date when the user will be unbanned, unix time. If user is
     * banned for more than 366 days or less than 30 seconds from the current time they are
     * considered to be banned forever
     */
    @JsonProperty("until_date")
    var untilDate: Long? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "kickChatMember"
    }

}
