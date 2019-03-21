package io.github.oleksivio.telegram.bot.core.controller.builder

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder
import io.github.oleksivio.telegram.bot.api.controller.ActionCreate
import io.github.oleksivio.telegram.bot.api.controller.ActionErrorListener
import io.github.oleksivio.telegram.bot.api.controller.ActionSend
import io.github.oleksivio.telegram.bot.api.model.NetworkError
import io.github.oleksivio.telegram.bot.core.controller.network.NetworkRequester
import io.github.oleksivio.telegram.bot.core.model.method.Action
import org.springframework.stereotype.Component

data class ActionHolder<RES>(val networkRequester: NetworkRequester, val action: Action<RES>)
    : ActionErrorListener<RES>, ActionSend<RES> {

    override fun send(): RES? {
        return networkRequester.send(action, networkErrorListener)
    }

    override fun errorListener(networkError: NetworkError): ActionSend<RES> {
        networkErrorListener = networkError
        return this
    }

    var networkErrorListener: NetworkError = {}

}

@Component
class ActionBuilderImpl(private val networkRequester: NetworkRequester) : ActionBuilder {
    override fun <RES> action(action: Action<RES>): ActionErrorListener<RES> {
        return ActionHolder(networkRequester, action)
    }

    override fun <RES> action(initBlock: ActionCreate<RES>): ActionErrorListener<RES> {
        return action(initBlock())
    }

}


