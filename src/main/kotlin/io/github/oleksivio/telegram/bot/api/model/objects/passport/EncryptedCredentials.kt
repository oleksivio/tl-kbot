package io.github.oleksivio.telegram.bot.api.model.objects.passport

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [EncryptedCredentials](https://core.telegram.org/bots/api/#encryptedcredentials)
 */
class EncryptedCredentials(
        /**
         * To setup filter:
         *
         *  NotNullFilter data data String Base64-encoded encrypted JSON-serialized data with unique user's payload, data
         * hashes and secrets required for EncryptedPassportElement decryption and authentication
         */
        @JsonProperty("data")
        var data: String? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter hash hash String Base64-encoded data hash for data authentication
         */
        @JsonProperty("hash")
        var hash: String? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter secret secret String Base64-encoded secret, encrypted with the bot's public RSA key, required
         * for data decryption
         */
        @JsonProperty("secret")
        var secret: String? = null
) : ITelegram 
