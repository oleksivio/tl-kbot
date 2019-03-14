package io.github.oleksivio.telegram.bot.api.model.method.game

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.game.SetGameScore

class SetOtherGameScore(networker: ActionNetworker) : SetGameScore<Boolean>(networker) {
    override val resultWrapperClass = BooleanResponse::class
}
