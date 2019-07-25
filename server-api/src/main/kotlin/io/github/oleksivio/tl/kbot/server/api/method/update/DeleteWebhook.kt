package io.github.oleksivio.tl.kbot.server.api.method.update

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

/**
 * @see [deleteWebhook](https://core.telegram.org/bots/api/#deletewebhook)
 */
class DeleteWebhook : Action<Boolean>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method: String = "deleteWebhook"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class
}

