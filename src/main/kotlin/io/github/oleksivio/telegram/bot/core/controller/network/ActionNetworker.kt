package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.model.NetworkError
import io.github.oleksivio.telegram.bot.core.model.CommonResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller

@Controller
class ActionNetworker(@Value("\${telegram.bot.token}") token: String) : Networker(token) {

    fun <T : CommonResponse<*>> run(action: Action<*>,
                                    clazz: Class<T>,
                                    networkErrorOpt: NetworkError): T? {
        return safelyRun(networkErrorOpt) { template, url -> template.postForEntity(url, action, clazz).body }
    }

}

