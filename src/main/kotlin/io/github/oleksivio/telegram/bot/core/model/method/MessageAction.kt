package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse

abstract class MessageAction(method: String, actionNetworker: ActionNetworker) : ChatAction<Message>(method, actionNetworker) {
    /**
     * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional
     * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty("reply_markup")
    var replyMarkup: IKeyboard? = null
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a notification with
     * no sound.
     */
    @JsonProperty("disable_notification")
    var disableNotification: Boolean? = null
    /**
     * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    var replyToMessageId: Long? = null

    override val resultWrapperClass = MessageResponse::class
}
