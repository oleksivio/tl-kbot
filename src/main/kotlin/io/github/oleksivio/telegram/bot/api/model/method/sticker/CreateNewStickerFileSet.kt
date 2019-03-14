package io.github.oleksivio.telegram.bot.api.model.method.sticker

import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.MaskPosition
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [createNewStickerSet](https://core.telegram.org/bots/api.createnewstickerset)
 */
class CreateNewStickerFileSet(fileNetworker: FileNetworker) : UploadFile<Boolean>(METHOD, fileNetworker) {

    override val resultWrapperClass = BooleanResponse::class

    fun setUserId(userId: Long?) {
        putLong(USER_ID_KEY, userId)

    }

    fun setEmojis(emojis: String) {
        putString(EMOJIS_KEY, emojis)

    }

    fun setContainsMasks(containsMasks: Boolean?) {
        putBool(CONTAINS_MASKS_KEY, containsMasks)

    }

    fun setMaskPosition(maskPosition: MaskPosition) {
        putObject(MASK_POSITON_KEY, maskPosition)

    }

    fun setName(name: String) {
        putString(NAME_KEY, name)

    }

    fun setTitle(title: String) {
        putString(TITLE_KEY, title)

    }

    fun setPngSticker(fileSystemResource: FileSystemResource) {
        putFile(PNG_STICKER_KEY, fileSystemResource)

    }

    companion object {
        private const val METHOD = "createNewStickerSet"
        /**
         * user_id Integer Yes User identifier of created sticker set owner
         */
        private const val USER_ID_KEY = "user_id"
        /**
         * name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only
         * english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must
         * end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
        </bot_username></bot> */
        private const val NAME_KEY = "name"
        /**
         * title String Yes Sticker set title, 1-64 characters
         */
        private const val TITLE_KEY = "title"
        /**
         * png_sticker InputFile  Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not
         * exceed 512px, and either width or height must be exactly 512px. upload a new one using multipart/form-data.
         */
        private const val PNG_STICKER_KEY = "png_sticker"
        /**
         * emojis String Yes One or more emoji corresponding to the sticker
         */
        private const val EMOJIS_KEY = "emojis"
        /**
         * contains_masks Boolean Optional Pass True, if a set of mask stickers should be created
         */
        private const val CONTAINS_MASKS_KEY = "contains_masks"
        /**
         * mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces
         */
        private const val MASK_POSITON_KEY = "mask_position"
    }

}
