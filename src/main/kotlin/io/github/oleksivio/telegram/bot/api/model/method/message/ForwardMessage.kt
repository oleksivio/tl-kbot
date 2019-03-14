package io.github.oleksivio.telegram.bot.api.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [forwardMessage](https://core.telegram.org/bots/api.forwardmessage)
 */
class ForwardMessage(actionNetworker: ActionNetworker) : ChatAction<Message>(FORWARD_MESSAGE, actionNetworker) {
    /**
     * from_chat_id Integer or String Unique identifier for the chat where the original message
     * was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    var fromChatId: Long? = null
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    var disableNotification: Boolean? = null
    /**
     * message_id Integer Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    var messageId: Long? = null

    override val resultWrapperClass = MessageResponse::class

    companion object {
        private const val FORWARD_MESSAGE = "forwardMessage"
    }

}
