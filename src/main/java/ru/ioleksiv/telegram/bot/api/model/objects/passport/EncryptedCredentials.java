package ru.ioleksiv.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#encryptedcredentials>EncryptedCredentials</a>
 */
public class EncryptedCredentials {
    /**
     * data	String	Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for EncryptedPassportElement decryption and authentication
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * hash	String	Base64-encoded data hash for data authentication
     */
    @JsonProperty("hash")
    private String hash = null;
    /**
     * secret	String	Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
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
