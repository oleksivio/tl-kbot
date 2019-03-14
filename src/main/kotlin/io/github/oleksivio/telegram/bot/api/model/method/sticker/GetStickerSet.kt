package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.StickerSet
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.StickerSetResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getStickerSet](https://core.telegram.org/bots/api.getstickerset)
 */
class GetStickerSet(actionNetworker: ActionNetworker) : RunnableAction<StickerSet>(METHOD, actionNetworker) {

    /**
     * name String Yes Name of the sticker set
     */
    @JsonProperty("name")
    var name: String? = null

    override val resultWrapperClass = StickerSetResponse::class

    companion object {
        private const val METHOD = "getStickerSet"
    }

}
