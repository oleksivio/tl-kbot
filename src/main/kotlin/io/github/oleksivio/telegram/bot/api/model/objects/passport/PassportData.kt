package io.github.oleksivio.telegram.bot.api.model.objects.passport

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [PassportData](https://core.telegram.org/bots/api/#passportdata)
 */
data class PassportData(
        /**
         * To setup filter:
         *
         *  EncryptedPassportElementArrayFilter encryptedPassportElements data Array of EncryptedPassportElement Array
         * with information about documents and other Telegram Passport elements that was shared with the bot
         */
        @JsonProperty("data")
        var encryptedPassportElements: List<EncryptedPassportElement>? = null,
        /**
         * To setup filter:
         *
         *  EncryptedCredentialsFilter encryptedCredentials credentials EncryptedCredentials Encrypted credentials
         * required to decrypt the data
         */
        @JsonProperty("credentials")
        var encryptedCredentials: EncryptedCredentials? = null
) : ITelegram
