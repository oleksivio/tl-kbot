package io.github.oleksivio.telegram.bot.api.model.method.game

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.game.SetGameScore

class SetOwnGameScore(actionNetworker: ActionNetworker) : SetGameScore<Message>(actionNetworker) {

    override val resultWrapperClass = MessageResponse::class
}
