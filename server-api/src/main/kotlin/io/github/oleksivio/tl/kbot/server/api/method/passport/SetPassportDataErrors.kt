package io.github.oleksivio.tl.kbot.server.api.method.passport

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.passport.errors.PassportElementError

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
