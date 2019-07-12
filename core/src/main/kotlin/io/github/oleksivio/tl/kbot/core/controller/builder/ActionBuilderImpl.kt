package io.github.oleksivio.tl.kbot.core.controller.builder

import io.github.oleksivio.tl.kbot.core.controller.ActionBuilder
import io.github.oleksivio.tl.kbot.core.controller.ActionCreate
import io.github.oleksivio.tl.kbot.core.controller.ActionErrorListener
import io.github.oleksivio.tl.kbot.core.controller.ActionSend
import io.github.oleksivio.tl.kbot.core.controller.network.ApiProvider
import io.github.oleksivio.tl.kbot.core.controller.network.ServerErrorListener
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

data class ActionHolder<RES>(val apiProvider: ApiProvider, val action: Action<RES>) :
    ActionErrorListener<RES>,
    ActionSend<RES> {

    override fun send(): RES? {
        return apiProvider.send(action, serverErrorListenerListener)
    }

    override fun errorListener(serverErrorListener: ServerErrorListener): ActionSend<RES> {
        serverErrorListenerListener = serverErrorListener
        return this
    }

    var serverErrorListenerListener: ServerErrorListener = {}
}

class ActionBuilderImpl(private val networkRequester: ApiProvider) :
    ActionBuilder {

    override fun <RES> action(action: Action<RES>): ActionErrorListener<RES> {
        return ActionHolder(networkRequester, action)
    }

    override fun <RES> action(initBlock: ActionCreate<RES>): ActionErrorListener<RES> {
        return action(initBlock())
    }
}


