package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.File
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.FileResponse
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [uploadStickerFile](https://core.telegram.org/bots/api/#uploadstickerfile)
 */
data class UploadStickerFile(
        /**
         * user_id Integer Yes User identifier of sticker file owner
         */
        val userId: Long,
        /**
         * png_sticker InputFile Yes Png image with the sticker, must be up to 512 kilobytes in size,
         * dimensions must not exceed 512px, and either width or height must be exactly 512px.
         */
        val pngSticker: FileSystemResource

) : UploadFile<File>() {

    override fun ActionMap.fill() {
        putObject(ApiDict.PNG_STICKER_KEY, pngSticker)
        putLong(ApiDict.USER_ID_KEY, userId)
    }

    override val resultWrapperClass = FileResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "uploadStickerFile"

}
