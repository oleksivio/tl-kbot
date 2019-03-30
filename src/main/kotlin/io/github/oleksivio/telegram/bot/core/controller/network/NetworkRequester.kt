package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.model.ServerErrorListener
import io.github.oleksivio.telegram.bot.core.model.method.Action
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadFile
import org.springframework.stereotype.Component
import org.springframework.util.MultiValueMap

@Component
class NetworkRequester(private val actionNetworker: ActionNetworker,
                       private val fileNetworker: FileNetworker) {

    fun <RES> send(action: Action<RES>, serverErrorListenerListener: ServerErrorListener): RES? {
        val commonResponse = when (action) {
            is UploadFile -> {
                fileNetworker.run(action.toRequestMap(), action.resultWrapperClass.java, serverErrorListenerListener)
            }
            else -> {
                actionNetworker.run(action, action.resultWrapperClass.java, serverErrorListenerListener)
            }
        }
        return commonResponse?.get()

    }

    private fun <RES> UploadFile<RES>.toRequestMap(): MultiValueMap<String, Any> {
        return this.toActionMap().toLinkedMultiValueMap()
    }
}
