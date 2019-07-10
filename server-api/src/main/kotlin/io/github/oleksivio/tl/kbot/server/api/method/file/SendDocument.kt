package io.github.oleksivio.tl.kbot.server.api.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.file.ThumbAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [sendDocument](https://core.telegram.org/bots/api/#senddocument)
 */
data class SendDocument(
    /**
         * chat_id	Integer or String	Yes	Unique identifier for the target chat or username of the target channel
         */
        override val chatId: ChatId,
    /**
         * document	InputFile or String	Yes	File to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. More info on Sending Files »
         */
        @JsonProperty(ApiDict.DOCUMENT_KEY)
        val document: String,
    /**
         * thumb	InputFile or String	Optional	Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>. More info on Sending Files »
         */
        override val thumb: InputFile? = null,
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
) : ThumbAction() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendDocument"
}

