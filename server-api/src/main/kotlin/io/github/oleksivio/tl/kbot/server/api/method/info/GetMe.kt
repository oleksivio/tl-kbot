package io.github.oleksivio.tl.kbot.server.api.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.UserResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.std.User

/**
 * @see [getMe](https://core.telegram.org/bots/api/#getme)
 */
class GetMe : Action<User>() {

    @JsonIgnore
    override val resultWrapperClass = UserResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getMe"
}
