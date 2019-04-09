package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendAnimation](https://core.telegram.org/bots/api/#sendanimation)
 */
data class SendAnimationFile(
        /**
         * chat_id Integer Yes Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        val chatId: Long,
        /**
         * animation InputFile or String Yes Animation to send. Pass a file_id as String to send an animation that exists on
         * the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the
         * Internet, or upload a new animation using multipart/form-data.
         */
        val animation: FileSystemResource,
        /**
         * duration [Integer] OptionalDuration of sent animation in seconds
         */
        val duration: Int? = null,
        /**YY
         * width [Integer] OptionalAnimation width
         */
        val width: Int? = null,
        /**
         * height [Integer] OptionalAnimation height
         */
        val height: Int? = null,
        /**
         * thumb  [String] Optional Thumbnail of the file sent;
         * can be ignored if thumbnail generation for the file is supported server-side.
         * The thumbnail should be in JPEG format and less than 200 kB in size.
         * A thumbnail‘s width and height should not exceed 90.
         * Ignored if the file is not uploaded using multipart/form-data.
         * Thumbnails can’t be reused and can be only uploaded as a new file,
         * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>. More info on Sending Files »
         */
        val thumb: FileSystemResource? = null,
        /**
         * caption [String] Optional Animation caption (may also be used when resending animation by file_id), 0-1024 characters
         */
        override val caption: String? = null,
        /**
         * parse_mode [String] Optional Send Markdown or HTML, if you want Telegram apps to show bold, italic,
         * fixed-width text or inline URLs in the media caption.
         */
        override val parseMode: String? = null,
        /**
         * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional
         * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
         * instructions to remove reply keyboard or to force a reply from the user.
         */
        override val replyMarkup: IKeyboard? = null,
        /**
         * disable_notification [Boolean] OptionalSends the message silently.
         * Users will receive a notification with no sound.
         */
        override val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        override val replyToMessageId: Long? = null
) : UploadMediaFile() {

    override fun ActionMap.fill() {
        thumb?.let { putFile(ApiDict.THUMB_KEY, it) }
        putFile(ApiDict.ANIMATION_KEY, animation)
        duration?.let { putInt(ApiDict.DURATION_KEY, it) }
        width?.let { putInt(ApiDict.WIDTH_KEY, it) }
        height?.let { putInt(ApiDict.HEIGHT_KEY, it) }
        replyMarkup?.let { putObject(ApiDict.REPLY_MARKUP_KEY, it) }
        disableNotification?.let { putBool(ApiDict.DISABLE_NOTIFICATION_KEY, it) }
        replyToMessageId?.let { putLong(ApiDict.REPLY_TO_MESSAGE_ID_KEY, it) }
        putLong(ApiDict.CHAT_ID_KEY, chatId)
        parseMode?.let { putString(ApiDict.PARSE_MODE_KEY, it) }
        caption?.let { putString(ApiDict.CAPTION_KEY, it) }
    }

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendAnimation"

}
