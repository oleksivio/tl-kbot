package io.github.oleksivio.tl.kbot.spring

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.oleksivio.tl.kbot.core.controller.network.ApiProvider
import io.github.oleksivio.tl.kbot.core.controller.network.ServerErrorListener
import io.github.oleksivio.tl.kbot.core.model.ErrorResponse
import io.github.oleksivio.tl.kbot.server.api.model.CommonResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import org.slf4j.LoggerFactory
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestClientException
import org.springframework.web.client.RestOperations
import org.springframework.web.client.RestTemplate
import java.io.IOException

/**
 * Created by oleksivio on 14.03.19 at 7:24
 * Project: telegram-bot-api
 */

open class ApiProviderImpl(token: String) : ApiProvider(token) {

    override fun <RES> send(action: Action<RES>, serverErrorListener: ServerErrorListener): RES? {
        val commonResponse = run {
            safelyRun(serverErrorListener) { template, url ->
                template.postForEntity(
                    url,
                    action,
                    action.resultWrapperClass.java
                ).body
            }
        }
        return commonResponse?.get()
    }

    private val LOG = LoggerFactory.getLogger(ApiProviderImpl::class.java)

    private val template = RestTemplate()

    fun <T : CommonResponse<*>> safelyRun(
        serverErrorListener: ServerErrorListener,
        networker: (template: RestOperations, url: String) -> T?
    ): T? {
        return try {
            return networker(template, url)
        } catch (httpException: HttpClientErrorException) {
            parseErrorResponse(httpException)?.let { exception ->
                serverErrorListener(exception)
            }
            null
        } catch (e: RestClientException) {
            LOG.error("", e)
            null
        }
    }

    private fun parseErrorResponse(exception: HttpClientErrorException): ErrorResponse? {
        return try {
            return ObjectMapper().readValue(exception.responseBodyAsString, ErrorResponse::class.java)
        } catch (ignored: IOException) {
            null
        }
    }
}

