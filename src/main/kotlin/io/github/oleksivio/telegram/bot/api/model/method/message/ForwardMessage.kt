package io.github.oleksivio.telegram.bot.api.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [forwardMessage](https://core.telegram.org/bots/api/#forwardmessage)
 */
data class ForwardMessage(
        /**
         * chat_id Integer or String Yes Unique identifier
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * from_chat_id Integer or String Yes Unique identifier for the chat where the original message was sent
         */
        @JsonProperty(ApiDict.FROM_CHAT_ID_KEY)
        val fromChatId: Long,
        /**
         * disable_notification Boolean Optional Sends the message silently.
         * Users will receive a notification with no sound.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        val disableNotification: Boolean? = null,
        /**
         * message_id Integer Yes Message identifier in the chat specified in from_chat_id
         */
        @JsonProperty(ApiDict.MESSAGE_ID_KEY)
        val messageId: Long

) : ChatAction<Message>() {

    override val method = "forwardMessage"
    override val resultWrapperClass = MessageResponse::class
}
