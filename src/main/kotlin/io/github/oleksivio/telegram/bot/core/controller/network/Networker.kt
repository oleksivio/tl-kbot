package io.github.oleksivio.telegram.bot.core.controller.network

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.oleksivio.telegram.bot.api.model.ErrorResponse
import io.github.oleksivio.telegram.bot.api.model.NetworkError
import io.github.oleksivio.telegram.bot.core.model.CommonResponse
import org.slf4j.LoggerFactory
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestClientException
import org.springframework.web.client.RestOperations
import java.io.IOException

/**
 * Created by oleksivio on 14.03.19 at 7:24
 * Project: telegram-bot-api
 */
private const val TELEGRAM_SERVER_URL = "https://api.telegram.org/bot"
private const val URL_SEPARATOR = '/'

open class Networker(private val template: RestOperations,
                     token: String) {
    private val LOG = LoggerFactory.getLogger(Networker::class.java)

    private val url: String = TELEGRAM_SERVER_URL + token + URL_SEPARATOR

    fun <T : CommonResponse<*>> safelyRun(networkError: NetworkError?,
                                          networker: (template: RestOperations, url: String) -> T?): T? {
        return try {
            return networker(template, url)
        } catch (httpException: HttpClientErrorException) {
            parseErrorResponse(httpException)?.let { exception ->
                networkError?.onServerError(exception)
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

