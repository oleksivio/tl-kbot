package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

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

    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setStickerPositionInSet"

}
