package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia.InputMedia
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction
import java.util.*

/**
 * @see [sendMediaGroup](https://core.telegram.org/bots/api.sendmediagroup)
 */
class SendMediaGroup(actionNetworker: ActionNetworker) : ChatAction<Message>(METHOD, actionNetworker) {
    /**
     * media Array of InputMedia A JSON-serialized array describing photos and videos to be
     * sent, must include 2–10 items
     */
    @JsonProperty("media")
    var media: List<InputMedia> = ArrayList()
    /**
     * disable_notification Boolean Optional Sends the messages silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    var disableNotification: Boolean? = null
    /**
     * reply_to_message_id Integer Optional If the messages are a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    var replyToMessageId: Long? = null

    override val resultWrapperClass = MessageResponse::class

    companion object {
        private const val METHOD = "sendMediaGroup"
    }

}
