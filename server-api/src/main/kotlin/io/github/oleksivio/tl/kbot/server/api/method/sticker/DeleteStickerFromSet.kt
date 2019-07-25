package io.github.oleksivio.tl.kbot.server.api.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

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


