package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.ApiDict.DURATION_KEY
import io.github.oleksivio.telegram.bot.core.model.ApiDict.VOICE_KEY
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendVoice](https://core.telegram.org/bots/api/#sendvoice)
 */
data class SendVoiceFile(
        /**
         * chat_id Integer Yes Unique identifier for the target chat
         */
        val chatId: Long,
        /**
         * voice  String Audio file to send. Pass a file_id as String to send a file
         * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
         * to get a file from the Internet
         */
        val voice: FileSystemResource,
        /**
         * duration [Integer] OptionalDuration of the voice message in seconds
         */
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
) : UploadMediaFile() {
    override fun ActionMap.fill() {
        putFile(VOICE_KEY, voice)
        duration?.let { putInt(DURATION_KEY, it) }

        replyMarkup?.let { putObject(ApiDict.REPLY_MARKUP_KEY, it) }
        disableNotification?.let { putBool(ApiDict.DISABLE_NOTIFICATION_KEY, it) }
        replyToMessageId?.let { putLong(ApiDict.REPLY_TO_MESSAGE_ID_KEY, it) }
        putLong(ApiDict.CHAT_ID_KEY, chatId)
        parseMode?.let { putString(ApiDict.PARSE_MODE_KEY, it) }
        caption?.let { putString(ApiDict.CAPTION_KEY, it) }
    }

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendVoice"
}
