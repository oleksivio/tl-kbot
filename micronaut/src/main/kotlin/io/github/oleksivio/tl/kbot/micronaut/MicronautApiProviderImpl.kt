package io.github.oleksivio.tl.kbot.micronaut

import io.github.oleksivio.tl.kbot.core.controller.network.ApiProvider
import io.github.oleksivio.tl.kbot.core.controller.network.ServerErrorListener
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.micronaut.context.annotation.Value
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.DefaultHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class MicronautApiProviderImpl(
    @Client("$TELEGRAM_SERVER_URL\${telegram.bot.token}/") @Inject private val httpClient: DefaultHttpClient,
    @Value("\${telegram.bot.token}") token: String
) : ApiProvider(token) {

    private val LOG = LoggerFactory.getLogger(MicronautApiProviderImpl::class.java)

    override fun <RES> send(action: Action<RES>, serverErrorListener: ServerErrorListener): RES? {
        return try {
            val req = HttpRequest.POST("", action)
            val flowable = httpClient.retrieve(req, action.resultWrapperClass.java)
            val result = flowable.firstElement()
            result.blockingGet().get()
        } catch (httpClientException: HttpClientResponseException) {
            // TODO [serverErrorListener] call
            LOG.error(
                "Telegram server error. Check sent params of request and check that user not block bot",
                httpClientException
            )
            null
        } catch (e: Exception) {
            LOG.error("", e)
            null
        }
    }
}

