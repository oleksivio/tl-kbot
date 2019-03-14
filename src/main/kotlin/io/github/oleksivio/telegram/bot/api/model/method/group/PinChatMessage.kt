package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [pinChatMessage](https://core.telegram.org/bots/api.pinchatmessage)
 */
class PinChatMessage(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * message_id Integer Identifier of a message to pin
     */
    @JsonProperty("message_id")
    var messageId: Long? = null
    /**
     * disable_notification Boolean Optional Pass True, if it is not necessary to send a
     * notification to all chat members about the new pinned message. Notifications are always
     * disabled in channels.
     */
    @JsonProperty("disable_notification")
    var disableNotification: Boolean? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "pinChatMessage"
    }

}
