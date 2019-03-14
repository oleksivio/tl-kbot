package io.github.oleksivio.telegram.bot.api.model.objects.passport.errors

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportConstants
import io.github.oleksivio.telegram.bot.core.model.type.NamedType

/**
 * @see [PassportElementErrorDataField](https://core.telegram.org/bots/api.passportelementerrordatafield)
 */
data class PassportElementErrorDataField(
        @JsonProperty("source")
        val source: String = "data",

        /**
         * field_name String Name of the data field which has the error
         */
        @JsonProperty("field_name")
        var fieldName: String? = null,
        /**
         * data_hash String Base64-encoded data hash
         */
        @JsonProperty("data_hash")
        var dataHash: String? = null) : PassportElementError() {
    fun setType(type: Type) {
        this.type = type.stringName
    }

    enum class Type(override val stringName: String) : NamedType {
        PERSONAL_DETAILS(PassportConstants.PERSONAL_DETAILS),
        PASSPORT(PassportConstants.PASSPORT),
        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(PassportConstants.INTERNAL_PASSPORT),
        ADDRESS(PassportConstants.ADDRESS);
    }

}
