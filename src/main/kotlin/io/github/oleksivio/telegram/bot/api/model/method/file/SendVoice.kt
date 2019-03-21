package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.method.common.CaptionAction

/**
 * @see [sendVoice](https://core.telegram.org/bots/api/#sendvoice)
 */
data class SendVoice(
        /**
         * chat_id Integer Yes Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * voice  String Audio file to send. Pass a file_id as String to send a file
         * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
         * to get a file from the Internet
         */
        @JsonProperty("voice")
        val voice: String,
        /**
         * duration Integer Optional Duration of the voice message in seconds
         */
        @JsonProperty("duration")
        val duration: Int? = null,
        /**
         * caption	String	Optional	Document caption (may also be used when resending documents by file_id), 0-1024 characters
         */
        override val caption: String? = null,
        /**
         * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
         */
        override val parseMode: String? = null,
        /**
         * disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with no sound.
         */
        override val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message
         */
        override val replyToMessageId: Long? = null,
        /**
         * reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
         */
        override val replyMarkup: IKeyboard? = null
) : CaptionAction() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendVoice"
}

