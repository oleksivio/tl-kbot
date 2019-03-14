package io.github.oleksivio.telegram.bot.api.model.method.message

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.message.EditMessageCaption

class EditOwnMessageCaption(actionNetworker: ActionNetworker) : EditMessageCaption<Message>(actionNetworker) {

    override val resultWrapperClass = MessageResponse::class
}
