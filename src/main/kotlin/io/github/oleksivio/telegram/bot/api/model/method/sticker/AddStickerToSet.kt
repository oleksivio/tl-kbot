package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.MaskPosition
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [addStickerToSet](https://core.telegram.org/bots/api.addstickertoset)
 */
class AddStickerToSet(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {
    /**
     * user_id Integer Yes User identifier of created sticker set owner
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
    </bot_username></bot> */
    @JsonProperty("name")
    var name: String? = null
    /**
     * png_sticker  String Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet
     */
    @JsonProperty("png_sticker")
    var pngSticker: String? = null
    /**
     * emojis String Yes One or more emoji corresponding to the sticker
     */
    @JsonProperty("emojis")
    var emojis: String? = null
    /**
     * mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces
     */
    @JsonProperty("mask_position")
    var maskPosition: MaskPosition? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "addStickerToSet"
    }

}
