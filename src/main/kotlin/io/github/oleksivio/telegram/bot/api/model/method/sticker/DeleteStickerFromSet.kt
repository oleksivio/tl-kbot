package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [deleteStickerFromSet](https://core.telegram.org/bots/api/#deletestickerfromset)
 */
class DeleteStickerFromSet(
        /**
         * sticker String Yes File identifier of the sticker
         */
        @JsonProperty(ApiDict.STICKER_KEY)
        val sticker: String
) : Action<Boolean>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "deleteStickerFromSet"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class
}


