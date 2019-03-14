package io.github.oleksivio.telegram.bot.api.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadMediaFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [sendAnimation](https://core.telegram.org/bots/api.sendanimation)
 */
class SendAnimationFile(fileNetworker: FileNetworker) : UploadMediaFile(METHOD, fileNetworker) {

    fun setThumb(thumb: FileSystemResource) {
        putFile(THUMB_KEY, thumb)

    }

    fun setAnimation(animation: FileSystemResource) {
        putFile(ANIMATION_KEY, animation)

    }

    fun setDuration(duration: Int?) {
        putInt(DURATION_KEY, duration)

    }

    fun setWidth(width: Int?) {
        putInt(WIDTH_KEY, width)

    }

    fun setHeight(height: Int?) {
        putInt(HEIGHT_KEY, height)

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
        private const val METHOD = "sendAnimation"

        /**
         * animation InputFile or String Yes Animation to send. Pass a file_id as String to send an animation that exists on
         * the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the
         * Internet, or upload a new animation using multipart/form-data.
         */
        private const val ANIMATION_KEY = "animation"
        /**
         * duration Integer Optional Duration of sent animation in seconds
         */
        private const val DURATION_KEY = "duration"
        /**
         * width Integer Optional Animation width
         */
        private const val WIDTH_KEY = "width"
        /**
         * height Integer Optional Animation height
         */
        private const val HEIGHT_KEY = "height"
        /**
         * thumb InputFile or String Optional Thumbnail of the file sent. The thumbnail should be in JPEG format and less than
         * 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded using
         * multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass
         * “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>.
        </file_attach_name></file_attach_name> */
        private const val THUMB_KEY = "thumb"
    }

}
