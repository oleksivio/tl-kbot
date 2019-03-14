package io.github.oleksivio.telegram.bot.api.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendAudio](https://core.telegram.org/bots/api.sendaudio)
 */
class SendAudioFile(fileNetworker: FileNetworker) : UploadMediaFile(METHOD, fileNetworker) {

    fun setThumb(thumb: FileSystemResource) {
        putFile(THUMB_KEY, thumb)

    }

    fun setDuration(duration: Int?) {
        putInt(DURATION_KEY, duration)

    }

    fun setPerformer(performer: String) {
        putString(PERFORMER_KEY, performer)

    }

    fun setTitle(title: String) {
        putString(TITLE_KEY, title)

    }

    fun setAudio(audio: FileSystemResource) {
        putFile(AUDIO_KEY, audio)

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
        private const val METHOD = "sendAudio"

        /**
         * audio InputFile Audio file to send. Upload a new
         * file using multipart/form-data.
         */
        private const val AUDIO_KEY = "audio"
        /**
         * duration Integer Optional Duration of the audio in seconds
         */
        private const val DURATION_KEY = "duration"
        /**
         * performer String Optional Performer
         */
        private const val PERFORMER_KEY = "performer"
        /**
         * title String Optional Track name
         */
        private const val TITLE_KEY = "title"
        /**
         * thumb InputFile or String Optional Thumbnail of the file sent. The thumbnail should be
         * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
         * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
         * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
         * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
        </file_attach_name></file_attach_name> */
        private const val THUMB_KEY = "thumb"
    }

}
