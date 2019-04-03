package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.model.ServerErrorListener
import io.github.oleksivio.telegram.bot.core.model.CommonResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.util.MultiValueMap

/**
 * Created by oleksivio on 14.03.19 at 8:19
 * Project: telegram-bot-api
 */
@Controller
class FileNetworker(@Value("\${telegram.bot.token}") token: String) : Networker(token) {

    fun <T : CommonResponse<*>> run(requestMap: MultiValueMap<String, Any>,
                                    clazz: Class<T>,
                                    serverErrorListener: ServerErrorListener): T? {

        return safelyRun(serverErrorListener) { template, url ->
            val headers = HttpHeaders()
            headers.contentType = MediaType.MULTIPART_FORM_DATA

            val requestEntity = HttpEntity(requestMap, headers)

            template.postForObject(url, requestEntity, clazz)
        }
    }

}
