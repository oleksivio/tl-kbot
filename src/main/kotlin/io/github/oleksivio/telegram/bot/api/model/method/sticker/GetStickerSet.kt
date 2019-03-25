package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.StickerSet
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.StickerSetResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [getStickerSet](https://core.telegram.org/bots/api/#getstickerset)
 */
data class GetStickerSet(
        /**
         * name String Yes Name of the sticker set
         */
        @JsonProperty(ApiDict.NAME_KEY)
        val name: String
) : Action<StickerSet>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getStickerSet"

    @JsonIgnore
    override val resultWrapperClass = StickerSetResponse::class
}