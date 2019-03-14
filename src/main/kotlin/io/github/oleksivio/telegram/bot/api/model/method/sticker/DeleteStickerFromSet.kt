package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [deleteStickerFromSet](https://core.telegram.org/bots/api.deletestickerfromset)
 */
class DeleteStickerFromSet(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {
    /**
     * sticker String Yes File identifier of the sticker
     */
    @JsonProperty("sticker")
    var sticker: String? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "deleteStickerFromSet"
    }

}
