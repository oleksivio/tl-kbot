package io.github.oleksivio.telegram.bot.core.controller.builder

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder
import io.github.oleksivio.telegram.bot.api.controller.ActionCreate
import io.github.oleksivio.telegram.bot.api.controller.ActionErrorListener
import io.github.oleksivio.telegram.bot.api.controller.ActionSend
import io.github.oleksivio.telegram.bot.api.model.ServerErrorListener
import io.github.oleksivio.telegram.bot.core.controller.network.NetworkRequester
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import org.springframework.stereotype.Component

data class ActionHolder<RES>(val networkRequester: NetworkRequester, val action: Action<RES>)
    : ActionErrorListener<RES>, ActionSend<RES> {

    override fun send(): RES? {
        return networkRequester.send(action, serverErrorListenerListener)
    }

    override fun errorListener(serverErrorListener: ServerErrorListener): ActionSend<RES> {
        serverErrorListenerListener = serverErrorListener
        return this
    }

    var serverErrorListenerListener: ServerErrorListener = {}

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


