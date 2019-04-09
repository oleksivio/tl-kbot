package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.MaskPosition
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [createNewStickerSet](https://core.telegram.org/bots/api/#createnewstickerset)
 */
data class CreateNewStickerFileSet(
        /**
         * user_id Integer Yes User identifier of created sticker set owner
         */
        val userId: Long,
        /**
         * name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only
         * english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must
         * end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
        </bot_username></bot> */
        val name: String,
        /**
         * title String Yes Sticker set title, 1-64 characters
         */
        val title: String,
        /**
         * png_sticker InputFile  Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not
         * exceed 512px, and either width or height must be exactly 512px. upload a new one using multipart/form-data.
         */
        val pngSticker: FileSystemResource,
        /**
         * emojis String Yes One or more emoji corresponding to the sticker
         */
        val emojis: String,
        /**
         * contains_masks [Boolean] OptionalPass True, if a set of mask stickers should be created
         */
        val containsMasks: Boolean? = null,
        /**
         * mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces
         */
        val maskPosition: MaskPosition? = null
) : UploadFile<Boolean>() {
    override fun ActionMap.fill() {
        putLong(ApiDict.USER_ID_KEY, userId)
        putString(ApiDict.EMOJIS_KEY, emojis)
        containsMasks?.let { putBool(ApiDict.CONTAINS_MASKS_KEY, it) }
        maskPosition?.let { putObject(ApiDict.MASK_POSITON_KEY, it) }
        putString(ApiDict.NAME_KEY, name)
        putString(ApiDict.TITLE_KEY, title)
        putFile(ApiDict.PNG_STICKER_KEY, pngSticker)
    }

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "createNewStickerSet"

}
