package ru.ioleksiv.telegram.bot.core.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportdata>PassportData</a>
 */
public class PassportData {
    /**
     * data	Array of EncryptedPassportElement	Array with information about documents and other Telegram Passport elements that was shared with the bot
     */
    @JsonProperty("data")
    private List<EncryptedPassportElement> encryptedPassportElements;
    /**
     * credentials	EncryptedCredentials	Encrypted credentials required to decrypt the data
     */
    @JsonProperty("credentials")
    private EncryptedCredentials encryptedCredentials;
}
