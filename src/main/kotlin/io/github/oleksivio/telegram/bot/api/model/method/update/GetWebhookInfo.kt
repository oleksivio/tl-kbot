package io.github.oleksivio.telegram.bot.api.model.method.update

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.WebhookInfo
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.WebhookInfoResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [getWebhookInfo](https://core.telegram.org/bots/api/#getwebhookinfo)
 */
class GetWebhookInfo : Action<WebhookInfo>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method: String = "getWebhookInfo"

    @JsonIgnore
    override val resultWrapperClass = WebhookInfoResponse::class

}
