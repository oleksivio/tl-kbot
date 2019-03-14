package io.github.oleksivio.telegram.bot.api.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendVideoNote](https://core.telegram.org/bots/api.sendvideonote)
 */
class SendVideoNoteFile(fileNetworker: FileNetworker) : UploadMediaFile(METHOD, fileNetworker) {

    fun setThumb(thumb: FileSystemResource) {
        putFile(THUMB_KEY, thumb)
    }

    fun setLength(length: Int?) {
        putInt(LENGTH_KEY, length)
    }

    fun setVideoNote(videoNote: FileSystemResource) {
        putFile(VIDEO_NOTE_KEY, videoNote)
    }

    fun setDuration(duration: Int?) {
        putInt(DURATION_KEY, duration)
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
        private const val METHOD = "sendVideoNote"
        /**
         * video_note InputFile or String Video note to send. Pass a file_id as String to send a
         * video note that exists on the Telegram servers (recommended) or upload a new video using
         * multipart/form-data. More info on Sending Files ». Sending video notes by a URL is currently
         * unsupported
         */
        private const val VIDEO_NOTE_KEY = "video_note"
        /**
         * duration Integer Optional Duration of sent video in seconds
         */
        private const val DURATION_KEY = "duration"
        /**
         * length Integer Optional Video width and height
         */
        private const val LENGTH_KEY = "length"
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
