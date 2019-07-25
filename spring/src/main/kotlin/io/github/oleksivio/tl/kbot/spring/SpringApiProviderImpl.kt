package io.github.oleksivio.tl.kbot.spring

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.oleksivio.tl.kbot.core.controller.network.ApiProvider
import io.github.oleksivio.tl.kbot.core.controller.network.ServerErrorListener
import io.github.oleksivio.tl.kbot.core.model.ErrorResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestClientException
import org.springframework.web.client.RestTemplate
import java.io.IOException

@Component
class SpringApiProviderImpl(@Value("\${telegram.bot.token}") token: String) : ApiProvider(token) {

    private val LOG = LoggerFactory.getLogger(SpringApiProviderImpl::class.java)

    private val template = RestTemplate()

    override fun <RES> send(action: Action<RES>, serverErrorListener: ServerErrorListener): RES? {

        val commonResponse = try {
            template.postForEntity(
                url,
                action,
                action.resultWrapperClass.java
            ).body
        } catch (httpException: HttpClientErrorException) {
            parseErrorResponse(httpException)?.let { exception ->
                serverErrorListener(exception)
            }
            null
        } catch (e: RestClientException) {
            LOG.error("", e)
            null
        }

        return commonResponse?.get()
    }

    private fun parseErrorResponse(exception: HttpClientErrorException): ErrorResponse? {
        return try {
            return ObjectMapper().readValue(exception.responseBodyAsString, ErrorResponse::class.java)
        } catch (ignored: IOException) {
            null
        }
    }
}
