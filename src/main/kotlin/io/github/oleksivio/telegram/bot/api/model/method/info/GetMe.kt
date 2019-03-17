package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.UserResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [getMe](https://core.telegram.org/bots/api/#getme)
 */
class GetMe : Action<User>() {
    @JsonIgnore
    override val resultWrapperClass = UserResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getMe"

}
