package io.github.oleksivio.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.EncryptedCredentialsFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementArrayFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportdata>PassportData</a>
 */
public class PassportData implements ITelegram {
    /**
     * To setup filter:
     *
     * @see EncryptedPassportElementArrayFilter encryptedPassportElements
     * data Array of EncryptedPassportElement Array with information about documents and other Telegram Passport
     * elements that was shared with the bot
     */
    @JsonProperty("data")
    private List<EncryptedPassportElement> encryptedPassportElements = null;
    /**
     * To setup filter:
     *
     * @see EncryptedCredentialsFilter encryptedCredentials
     * credentials EncryptedCredentials Encrypted credentials required to decrypt the data
     */
    @JsonProperty("credentials")
    private EncryptedCredentials encryptedCredentials = null;

    public List<EncryptedPassportElement> getEncryptedPassportElements() {
        return encryptedPassportElements;
    }

    public void setEncryptedPassportElements(List<EncryptedPassportElement> encryptedPassportElements) {
        this.encryptedPassportElements = encryptedPassportElements;
    }

    public EncryptedCredentials getEncryptedCredentials() {
        return encryptedCredentials;
    }

    public void setEncryptedCredentials(EncryptedCredentials encryptedCredentials) {
        this.encryptedCredentials = encryptedCredentials;
    }
}
