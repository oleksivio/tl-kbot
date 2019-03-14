package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.oleksivio.telegram.bot.api.model.NetworkError

abstract class NetworkErrorAction<RES> : Action<RES>() {
    @JsonIgnore
    var networkErrorListener: NetworkError? = null
}
