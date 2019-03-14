package io.github.oleksivio.telegram.bot.api.model.method.sticker

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendSticker](https://core.telegram.org/bots/api.sendsticker)
 */
class SendStickerFile(fileNetworker: FileNetworker) : UploadMessageFile(METHOD, fileNetworker) {

    fun setSticker(sticker: FileSystemResource) {
        putFile(STIKER_KEY, sticker)
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

    companion object {
        private const val METHOD = "sendSticker"
        /**
         * sticker InputFile Yes Sticker to send. Upload a new one using multipart/form-data.
         */
        private const val STIKER_KEY = "sticker"
    }

}
