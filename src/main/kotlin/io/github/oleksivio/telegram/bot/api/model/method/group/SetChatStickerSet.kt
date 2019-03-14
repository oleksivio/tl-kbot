package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [setChatStickerSet](https://core.telegram.org/bots/api.setchatstickerset)
 */
class SetChatStickerSet(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * sticker_set_name String Name of the sticker set to be set as the group sticker set
     */
    @JsonProperty("sticker_set_name")
    var stickerSetName: String? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "setChatStickerSet"
    }

}
