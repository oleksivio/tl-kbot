package io.github.oleksivio.tl.kbot.server.api.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.file.ThumbAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [sendVideo](https://core.telegram.org/bots/api/#sendvideo)
 */
class SendVideo(
        /**
         * chat_id Integer Yes Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: ChatId,
        /**
         * video  String Video to send. Pass a file_id as String to send a video that
         * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
         * get a video from the Internet
         */
        @JsonProperty(ApiDict.VIDEO_KEY)
        val video: InputFile,
        /**
         * duration [Integer] OptionalDuration of sent video in seconds
         */
        @JsonProperty(ApiDict.DURATION_KEY)
        val duration: Int? = null,
        /**
         * width [Integer] OptionalVideo width
         */
        @JsonProperty(ApiDict.WIDTH_KEY)
        val width: Int? = null,
        /**
         * height [Integer] OptionalVideo height
         */
        @JsonProperty(ApiDict.HEIGHT_KEY)
        val height: Int? = null,
        /**
         * supports_streaming [Boolean] OptionalPass True, if the uploaded video is suitable for streaming
         */
        @JsonProperty(ApiDict.SUPPORTS_STREAMING_KEY)
        val supportsStreaming: Boolean? = null,
        /**
         * thumb  [String] Optional Thumbnail of the file sent;
         * can be ignored if thumbnail generation for the file is supported server-side.
         * The thumbnail should be in JPEG format and less than 200 kB in size.
         * A thumbnail‘s width and height should not exceed 90.
         * Ignored if the file is not uploaded using multipart/form-data.
         * Thumbnails can’t be reused and can be only uploaded as a new file,
         * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>. More info on Sending Files »
         */
        @JsonProperty(ApiDict.THUMB_KEY)
        override val thumb: InputFile? = null,
        /**
         * caption [String] Optional Animation caption (may also be used when resending animation by file_id), 0-1024 characters
         */
        @JsonProperty(ApiDict.CAPTION_KEY)
        override val caption: String? = null,
        /**
         * parse_mode [String] Optional Send Markdown or HTML, if you want Telegram apps to show bold, italic,
         * fixed-width text or inline URLs in the media caption.
         */
        @JsonProperty(ApiDict.PARSE_MODE_KEY)
        override val parseMode: String? = null,
        /**
         * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional
         * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
         * instructions to remove reply keyboard or to force a reply from the user.
         */
        @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
        override val replyMarkup: IKeyboard? = null,
        /**
         * disable_notification [Boolean] OptionalSends the message silently.
         * Users will receive a notification with no sound.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        override val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
        override val replyToMessageId: Long? = null
) : ThumbAction() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendVideo"
}


