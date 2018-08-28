package io.github.oleksivio.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#encryptedcredentials">EncryptedCredentials</a>
 */
public class EncryptedCredentials implements ITelegram {
    /**
     * To setup filter:
     *
     * @see NotNullFilter data
     * data String Base64-encoded encrypted JSON-serialized data with unique user's payload,
     * data hashes and secrets required for EncryptedPassportElement decryption and authentication
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter hash
     * hash String Base64-encoded data hash for data authentication
     */
    @JsonProperty("hash")
    private String hash = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter secret
     * secret String Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
     */
    @JsonProperty("secret")
    private String secret = null;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
