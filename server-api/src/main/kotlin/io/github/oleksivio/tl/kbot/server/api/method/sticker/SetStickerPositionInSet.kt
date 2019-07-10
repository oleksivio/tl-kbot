package io.github.oleksivio.tl.kbot.server.api.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

/**
 * @see [setStickerPositionInSet](https://core.telegram.org/bots/api/#setstickerpositioninset)
 */
data class SetStickerPositionInSet(
        /**
         * sticker String Yes File identifier of the sticker
         */
        @JsonProperty(ApiDict.STICKER_KEY)
        val sticker: String,
        /**
         * position Integer Yes New sticker position in the set, zero-based
         */
        @JsonProperty(ApiDict.POSITION_KEY)
        val position: Int
) : Action<Boolean>() {

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setStickerPositionInSet"

}
