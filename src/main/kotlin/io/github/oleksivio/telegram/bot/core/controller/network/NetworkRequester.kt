package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.model.ServerErrorListener
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import org.springframework.stereotype.Component

@Component
class NetworkRequester(private val actionNetworker: ActionNetworker,
                       private val fileNetworker: FileNetworker) {

    fun <RES> send(action: Action<RES>, serverErrorListenerListener: ServerErrorListener): RES? {
        val commonResponse = run {
            actionNetworker.run(action, action.resultWrapperClass.java, serverErrorListenerListener)
        }
        return commonResponse?.get()

    }
}
