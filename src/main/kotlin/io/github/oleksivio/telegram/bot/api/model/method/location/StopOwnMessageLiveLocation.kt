package io.github.oleksivio.telegram.bot.api.model.method.location

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.location.StopMessageLiveLocation

class StopOwnMessageLiveLocation(actionNetworker: ActionNetworker) : StopMessageLiveLocation<Message>(actionNetworker) {
    override val resultWrapperClass = MessageResponse::class
}
