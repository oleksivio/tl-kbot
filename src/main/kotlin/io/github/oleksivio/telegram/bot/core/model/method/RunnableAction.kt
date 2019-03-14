package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker

abstract class RunnableAction<RES> protected constructor(@get:JsonProperty("method")
                                                         val method: String,
                                                         private val actionNetworker: ActionNetworker)
    : NetworkErrorAction<RES>() {

    override fun send(): RES? {
        return actionNetworker.run(this, resultWrapperClass.java, networkErrorListener)?.get()
    }

}

fun <RES : RunnableAction<*>> RES.send(block: RES.() -> Unit) {
    block()
    this.send()
}
