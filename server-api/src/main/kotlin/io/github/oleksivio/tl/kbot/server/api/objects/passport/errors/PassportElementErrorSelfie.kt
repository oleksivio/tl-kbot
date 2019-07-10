package io.github.oleksivio.tl.kbot.server.api.objects.passport.errors

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportConstants
import io.github.oleksivio.tl.kbot.server.api.model.type.NamedType

/**
 *  [PassportElementErrorSelfie](https://core.telegram.org/bots/api/#passportelementerrorselfie)
 */
data class PassportElementErrorSelfie(
        @JsonProperty("source")
        val source: String = "selfie",

        /**
         * file_hash String Base64-encoded hash of the file with the front side of the document
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
