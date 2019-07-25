package io.github.oleksivio.tl.kbot.server.api.method.message

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.MessageResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message

/**
 * @see [forwardMessage](https://core.telegram.org/bots/api/#forwardmessage)
 */
data class ForwardMessage(
    /**
     * chat_id Integer or String Yes Unique identifier
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * from_chat_id Integer or String Yes Unique identifier for the chat where the original message was sent
     */
    @JsonProperty(ApiDict.FROM_CHAT_ID_KEY)
    val fromChatId: Long,
    /**
     * disable_notification [Boolean] OptionalSends the message silently.
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

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "forwardMessage"
    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}
