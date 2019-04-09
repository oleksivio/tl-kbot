package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [pinChatMessage](https://core.telegram.org/bots/api/#pinchatmessage)
 */
data class PinChatMessage(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * message_id Integer Identifier of a message to pin
         */
        @JsonProperty(ApiDict.MESSAGE_ID_KEY)
        val messageId: Long,
        /**
         * disable_notification [Boolean] OptionalPass True, if it is not necessary to send a
         * notification to all chat members about the new pinned message. Notifications are always
         * disabled in channels.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        val disableNotification: Boolean? = null
) : ChatAction<Boolean>() {
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "pinChatMessage"
}
