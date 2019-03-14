package io.github.oleksivio.telegram.bot.api.model.method.location

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.location.StopMessageLiveLocation

class StopOtherMessageLiveLocation(actionNetworker: ActionNetworker) : StopMessageLiveLocation<Boolean>(actionNetworker) {
    override val resultWrapperClass = BooleanResponse::class
}
