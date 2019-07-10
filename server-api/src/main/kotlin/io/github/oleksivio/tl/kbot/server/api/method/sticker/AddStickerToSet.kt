package io.github.oleksivio.tl.kbot.server.api.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.MaskPosition
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [addStickerToSet](https://core.telegram.org/bots/api/#addstickertoset)
 */
data class AddStickerToSet(
    /**
         * user_id Integer Yes User identifier of created sticker set owner
         */
        @JsonProperty(ApiDict.USER_ID_KEY)
        val userId: Long? = null,
    /**
         * name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
        </bot_username></bot> */
        @JsonProperty(ApiDict.NAME_KEY)
        val name: String? = null,
    /**
         * png_sticker  String Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet
         */
        @JsonProperty(ApiDict.PNG_STICKER_KEY)
        val pngSticker: InputFile? = null,
    /**
         * emojis String Yes One or more emoji corresponding to the sticker
         */
        @JsonProperty(ApiDict.EMOJIS_KEY)
        val emojis: String? = null,
    /**
         * mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces
         */
        @JsonProperty(ApiDict.MASK_POSITION_KEY)
        val maskPosition: MaskPosition? = null
) : Action<Boolean>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "addStickerToSet"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

}
