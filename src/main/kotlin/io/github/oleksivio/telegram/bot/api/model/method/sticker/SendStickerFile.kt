package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMessageFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendSticker](https://core.telegram.org/bots/api/#sendsticker)
 */
data class SendStickerFile(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel (in the format @channelusername)
         */
        val chatId: Long,
        /**
         * sticker InputFile or String Yes Sticker to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a .webp file from the Internet, or upload a new one using multipart/form-data. More info on Sending Files »
         */
        val sticker: FileSystemResource,
        /**
         * disable_notification [Boolean] OptionalSends the message silently. Users will receive a notification with no sound.
         */
        override val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        override val replyToMessageId: Long? = null,
        /**
         * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
         */
        override val replyMarkup: IKeyboard? = null
) : UploadMessageFile() {
    override fun ActionMap.fill() {
        putLong(ApiDict.CHAT_ID_KEY, chatId)
        putFile(ApiDict.STICKER_KEY, sticker)
        replyMarkup?.let { putObject(ApiDict.REPLY_MARKUP_KEY, it) }
        disableNotification?.let { putBool(ApiDict.DISABLE_NOTIFICATION_KEY, it) }
        replyToMessageId?.let { putLong(ApiDict.REPLY_TO_MESSAGE_ID_KEY, it) }
    }

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendSticker"

}
