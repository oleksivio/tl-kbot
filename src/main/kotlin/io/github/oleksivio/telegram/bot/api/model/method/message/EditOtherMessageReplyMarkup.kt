package io.github.oleksivio.telegram.bot.api.model.method.message

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.message.EditMessageReplyMarkup

class EditOtherMessageReplyMarkup(actionNetworker: ActionNetworker) : EditMessageReplyMarkup<Boolean>(actionNetworker) {

    override val resultWrapperClass = BooleanResponse::class

}
