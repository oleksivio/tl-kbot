package io.github.oleksivio.telegram.bot.api.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendVoice](https://core.telegram.org/bots/api.sendvoice)
 */
class SendVoiceFile(fileNetworker: FileNetworker) : UploadMediaFile(METHOD, fileNetworker) {

    fun setVoice(voice: FileSystemResource) {
        putFile(VOICE_KEY, voice)
    }

    fun setDuration(duration: Int?) {
        putInt(DURATION_KEY, duration)
    }

    fun setReplyMarkup(replyMarkup: IKeyboard) {
        putReplyMarkup(replyMarkup)
    }

    fun setDisableNotification(disableNotification: Boolean?) {
        putBool(io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile.DISABLE_NOTIFICATION_KEY, disableNotification)
    }

    fun setReplyToMessageId(replyToMessageId: Long?) {
        putLong(io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile.REPLY_TO_MESSAGE_ID, replyToMessageId)
    }

    fun setChatId(chatId: Long?) {
        putLong(io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile.CHAT_ID_KEY, chatId)
    }

    fun setParseMode(parseMode: String) {
        putString(UploadMediaFile.PARSE_MODE_KEY, parseMode)
    }

    fun setCaption(caption: String) {
        putString(UploadMediaFile.CAPTION_KEY, caption)
    }

    companion object {
        private const val METHOD = "sendVoice"
        /**
         * voice InputFile or String Audio file to send. Pass a file_id as String to send a file
         * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
         * to get a file from the Internet, or upload a new one using multipart/form-data.
         */
        private const val VOICE_KEY = "voice"
        /**
         * duration Integer Optional Duration of the voice message in seconds
         */
        private const val DURATION_KEY = "duration"
    }
}
