package io.github.oleksivio.tl.kbot.server.api.objects.passport.errors

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

abstract class PassportElementError protected constructor() : ITelegram {
    /**
     * type String The section of the user's Telegram Passport which has the error
     */
    @JsonProperty("type")
    var type: String? = null
        protected set
    /**
     * message String Error message
     */
    @JsonProperty("message")
    var message: String? = null
}
