package io.github.oleksivio.telegram.bot.core.model.method.location

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [stopMessageLiveLocation](https://core.telegram.org/bots/api.stopmessagelivelocation)
 */
abstract class StopMessageLiveLocation<RES>(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {
    companion object {
        private const val METHOD = "stopMessageLiveLocation"
    }

}
