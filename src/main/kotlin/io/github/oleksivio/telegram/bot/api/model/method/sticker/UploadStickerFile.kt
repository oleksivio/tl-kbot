package io.github.oleksivio.telegram.bot.api.model.method.sticker

import io.github.oleksivio.telegram.bot.api.model.objects.std.files.File
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.FileResponse
import io.github.oleksivio.telegram.bot.core.model.method.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [uploadStickerFile](https://core.telegram.org/bots/api.uploadstickerfile)
 */
class UploadStickerFile(fileNetworker: FileNetworker) : UploadFile<File>(METHOD, fileNetworker) {

    override val resultWrapperClass
        get() = FileResponse::class

    fun setPngSticker(pngSticker: FileSystemResource) {
        putFile(PNG_STICKER_KEY, pngSticker)
    }

    fun setUserId(userId: Long?) {
        putLong(USER_ID_KEY, userId)
    }

    companion object {
        private const val METHOD = "uploadStickerFile"
        /**
         * user_id Integer Yes User identifier of sticker file owner
         */
        private const val USER_ID_KEY = "user_id"
        /**
         * png_sticker InputFile Yes Png image with the sticker, must be up to 512 kilobytes in size,
         * dimensions must not exceed 512px, and either width or height must be exactly 512px.
         */
        private const val PNG_STICKER_KEY = "png_sticker"
    }

}
