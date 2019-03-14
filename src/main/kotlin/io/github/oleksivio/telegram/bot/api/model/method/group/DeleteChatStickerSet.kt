package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [deleteChatStickerSet](https://core.telegram.org/bots/api.deletechatstickerset)
 */
class DeleteChatStickerSet(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "deleteChatStickerSet"
    }

}
