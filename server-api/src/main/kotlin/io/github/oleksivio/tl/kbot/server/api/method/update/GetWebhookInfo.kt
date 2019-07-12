package io.github.oleksivio.tl.kbot.server.api.method.update

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.WebhookInfoResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.WebhookInfo

/**
 * @see [getWebhookInfo](https://core.telegram.org/bots/api/#getwebhookinfo)
 */
class GetWebhookInfo : Action<WebhookInfo>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method: String = "getWebhookInfo"

    @JsonIgnore
    override val resultWrapperClass = WebhookInfoResponse::class
}
