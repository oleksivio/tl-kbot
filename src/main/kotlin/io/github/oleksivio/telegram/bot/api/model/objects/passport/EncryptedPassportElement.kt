package io.github.oleksivio.telegram.bot.api.model.objects.passport

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType

/**
 *  [EncryptedPassportElement](https://core.telegram.org/bots/api/#encryptedpassportelement)
 */
data class EncryptedPassportElement(
        /**
         * To setup filter:
         *
         *  Type type type String Element type. One of “personal_details”, “passport”, “driver_license”, “identity_card”,
         * “internal_passport”, “address”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”,
         * “temporary_registration”, “phone_number”, “email”.
         */
        @JsonProperty("type")
        var type: String? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter data data [String] Optional. Base64-encoded encrypted Telegram Passport element data provided by
         * the user, available for “personal_details”, “passport”, “driver_license”, “identity_card”, “identity_passport” and
         * “address” types. Can be decrypted and verified using the accompanying EncryptedCredentials.
         */
        @JsonProperty("data")
        var data: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter phoneNumber phone_number [String] Optional. User's verified phone number, available only for
         * “phone_number” type
         */
        @JsonProperty("phone_number")
        var phoneNumber: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter email email [String] Optional. User's verified email address, available only for “email” type
         */
        @JsonProperty("email")
        var email: String? = null,
        /**
         * To setup filter:
         *
         *  PassportFileArrayFilter fileArray files Array of PassportFile Optional. Array of encrypted files with
         * documents provided by the user, available for “utility_bill”, “bank_statement”, “rental_agreement”,
         * “passport_registration” and “temporary_registration” types. Files can be decrypted and verified using the
         * accompanying EncryptedCredentials.
         */
        @JsonProperty("files")
        var files: List<PassportFile>? = null,
        /**
         * To setup filter:
         *
         *  PassportFileFilter frontSide front_side PassportFile Optional. Encrypted file with the front side of the
         * document, provided by the user. Available for “passport”, “driver_license”, “identity_card” and
         * “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
         */
        @JsonProperty("front_side")
        var frontSide: PassportFile? = null,
        /**
         * To setup filter:
         *
         *  PassportFileFilter reverseSide reverse_side PassportFile Optional. Encrypted file with the reverse side of the
         * document, provided by the user. Available for “driver_license” and “identity_card”. The file can be decrypted and
         * verified using the accompanying EncryptedCredentials.
         */
        @JsonProperty("reverse_side")
        var reverseSide: PassportFile? = null,
        /**
         * To setup filter:
         *
         *  PassportFileFilter selfie selfie PassportFile Optional. Encrypted file with the selfie of the user holding a
         * document, provided by the user; available for “passport”, “driver_license”, “identity_card” and
         * “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
         */
        @JsonProperty("selfie")
        var selfie: PassportFile? = null
) : ITelegram {
    enum class Type(override val typeName: String) : TelegramType {
        PERSONAL_DETAILS(PassportConstants.PERSONAL_DETAILS),
        PASSPORT(PassportConstants.PASSPORT),
        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(PassportConstants.INTERNAL_PASSPORT),
        ADDRESS(PassportConstants.ADDRESS),
        UTILITY_BILL(PassportConstants.UTILITY_BILL),
        BANK_STATEMENT(PassportConstants.BANK_STATEMENT),
        RENTAL_AGREEMENT(PassportConstants.RENTAL_AGREENENT),
        PASSPORT_REGISTRATION(PassportConstants.PASSPORT_REGISTRATION),
        TEMPORARY_REGISTRATION(PassportConstants.TEMPORARY_REGISTRATION),
        PHONE_NUMBER(PassportConstants.PHONE_NUMBER),
        EMAIL(PassportConstants.EMAIL),
        UNKNOWN("");

        override val isChosen: Boolean
            get() = this != UNKNOWN

        companion object {

            fun parse(input: String?): Type {
                return values().firstOrNull { it.typeName == input } ?: UNKNOWN
            }
        }

    }
}
