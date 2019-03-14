package io.github.oleksivio.telegram.bot.api.model.method.passport

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.passport.errors.PassportElementError
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction
import java.util.*

/**
 * @see [setPassportDataErrors](https://core.telegram.org/bots/api.setpassportdataerrors)
 */
class SetPassportDataErrors(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {
    /**
     * user_id Integer Yes User identifier
     */
    @JsonProperty("user_id")
    var userId: Int? = null
    /**
     * errors Array of PassportElementError Yes A JSON-serialized array describing the errors
     */
    @JsonProperty("errors")
    val errors = ArrayList<PassportElementError>()

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "setPassportDataErrors"
    }

}
