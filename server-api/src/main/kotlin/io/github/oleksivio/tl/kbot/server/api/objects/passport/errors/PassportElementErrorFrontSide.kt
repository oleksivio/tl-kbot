package io.github.oleksivio.tl.kbot.server.api.objects.passport.errors

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportConstants
import io.github.oleksivio.tl.kbot.server.api.model.type.NamedType

/**
 *  [PassportElementErrorFrontSide](https://core.telegram.org/bots/api/#passportelementerrorfrontside)
 */
data class PassportElementErrorFrontSide(
        @JsonProperty("source")
        val source: String = "front_side",

        /**
         * file_hash String Base64-encoded hash of the file with the front side of the document
         */
        /**
         * type String The section of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”,
         * “identity_card”, “internal_passport”
         */

        @JsonProperty("file_hash")
        var fileHash: String? = null
) : PassportElementError() {

    fun setType(type: Type) {
        this.type = type.typeName
    }

    enum class Type constructor(override val typeName: String) :
        NamedType {
        PASSPORT(PassportConstants.PASSPORT),
        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(PassportConstants.INTERNAL_PASSPORT);
    }

}
