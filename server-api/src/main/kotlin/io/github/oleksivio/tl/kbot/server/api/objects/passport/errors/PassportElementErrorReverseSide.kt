package io.github.oleksivio.tl.kbot.server.api.objects.passport.errors

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.type.NamedType
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportConstants

/**
 *  [PassportElementErrorReverseSide](https://core.telegram.org/bots/api/#passportelementerrorreverseside)
 */
class PassportElementErrorReverseSide : PassportElementError() {

    @JsonProperty("source")
    val source: String = "reverse_side"

    /**
     * file_hash String Base64-encoded hash of the file with the reverse side of the document
     */
    @JsonProperty("file_hash")
    var fileHash: String? = null

    fun setType(type: Type) {
        this.type = type.typeName
    }

    enum class Type constructor(override val typeName: String) :
        NamedType {

        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD);
    }
}
