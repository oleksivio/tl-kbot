package io.github.oleksivio.telegram.bot.api.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendPhoto](https://core.telegram.org/bots/api.sendphoto)
 */
class SendPhotoFile(fileNetworker: FileNetworker) : UploadMediaFile(METHOD, fileNetworker) {

    fun setPhoto(photo: FileSystemResource) {
        putFile(PHOTO_KEY, photo)
    }

    fun setReplyMarkup(replyMarkup: IKeyboard) {
        putReplyMarkup(replyMarkup)
    }

    fun setDisableNotification(disableNotification: Boolean?) {
        putBool(UploadMessageFile.DISABLE_NOTIFICATION_KEY, disableNotification)
    }

    fun setReplyToMessageId(replyToMessageId: Long?) {
        putLong(UploadMessageFile.REPLY_TO_MESSAGE_ID, replyToMessageId)
    }

    fun setChatId(chatId: Long?) {
        putLong(UploadMessageFile.CHAT_ID_KEY, chatId)
    }

    fun setParseMode(parseMode: String) {
        putString(UploadMediaFile.PARSE_MODE_KEY, parseMode)
    }

    fun setCaption(caption: String) {
        putString(UploadMediaFile.CAPTION_KEY, caption)
    }

    companion object {
        private const val METHOD = "sendPhoto"
        /**
         * photo InputFile or String Photo to send. Pass a file_id as String to send a photo that
         * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
         * get a photo from the Internet, or upload a new photo using multipart/form-data.
         */
        private const val PHOTO_KEY = "photo"
    }

}
