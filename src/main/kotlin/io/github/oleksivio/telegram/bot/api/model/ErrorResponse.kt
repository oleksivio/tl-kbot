package io.github.oleksivio.telegram.bot.api.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ErrorResponse(
        /**
         * error code
         */
        @JsonProperty("error_code")
        var errorCode: Int?,
        /**
         * description of error
         */
        @JsonProperty("description")
        var errorDescription: String?,
        /**
         * status
         */
        @JsonProperty("ok")
        var isStatus: Boolean = false
)
