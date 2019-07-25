package io.github.oleksivio.tl.kbot.server.api.method.file

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.MessageResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.inputmedia.InputMedia

/**
 * @see [sendMediaGroup](https://core.telegram.org/bots/api/#sendmediagroup)
 */
data class SendMediaGroup(
    /**
     * chat_id Integer Yes Unique identifier for the target chat
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * media Array of InputMedia A JSON-serialized array describing photos and videos to be
     * sent, must include 2–10 items
     */
    @JsonProperty("media")
    val media: List<InputMedia>,
    /**
     * disable_notification [Boolean] OptionalSends the messages silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    val disableNotification: Boolean? = null,
    /**
     * reply_to_message_id [Integer] OptionalIf the messages are a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    val replyToMessageId: Long? = null

) : ChatAction<Message>() {

    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendMediaGroup"
}
