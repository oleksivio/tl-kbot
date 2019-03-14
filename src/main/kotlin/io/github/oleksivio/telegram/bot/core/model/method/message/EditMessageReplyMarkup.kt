package io.github.oleksivio.telegram.bot.core.model.method.message

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [editMessageReplyMarkup](https://core.telegram.org/bots/api.editmessagereplymarkup)
 */
abstract class EditMessageReplyMarkup<RES>(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {

    companion object {
        private const val METHOD = "editMessageReplyMarkup"
    }
}
