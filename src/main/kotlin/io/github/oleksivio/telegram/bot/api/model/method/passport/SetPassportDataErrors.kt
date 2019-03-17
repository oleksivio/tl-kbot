package io.github.oleksivio.telegram.bot.api.model.method.passport

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.passport.errors.PassportElementError
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [setPassportDataErrors](https://core.telegram.org/bots/api/#setpassportdataerrors)
 */
data class SetPassportDataErrors(
        /**
         * user_id Integer Yes User identifier
         */
        @JsonProperty(ApiDict.USER_ID_KEY)
        val userId: Int,
        /**
         * errors Array of PassportElementError Yes A JSON-serialized array describing the errors
         */
        @JsonProperty(ApiDict.ERRORS_KEY)
        val errors: List<PassportElementError>

) : Action<Boolean>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setPassportDataErrors"
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class
}
