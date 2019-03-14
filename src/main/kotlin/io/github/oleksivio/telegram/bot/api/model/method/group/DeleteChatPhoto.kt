package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [deleteChatPhoto](https://core.telegram.org/bots/api.deletechatphoto)
 */
class DeleteChatPhoto(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "deleteChatPhoto"
    }

}
