package ru.ioleksiv.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportdata>PassportData</a>
 */
public class PassportData implements ITelegram {
    /**
     * data	Array of EncryptedPassportElement	Array with information about documents and other Telegram Passport elements that was shared with the bot
     */
    @JsonProperty("data")
    private List<EncryptedPassportElement> encryptedPassportElements = new ArrayList<>();
    /**
     * credentials	EncryptedCredentials	Encrypted credentials required to decrypt the data
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
