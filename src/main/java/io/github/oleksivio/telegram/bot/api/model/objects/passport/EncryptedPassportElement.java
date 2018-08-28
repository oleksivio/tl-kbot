package io.github.oleksivio.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#encryptedpassportelement>EncryptedPassportElement</a>
 */
public class EncryptedPassportElement implements ITelegram {

    /**
     * To setup filter:
     *
     * @see Type type
     * type String Element type.
     * One of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”,
     * “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”,
     * “phone_number”, “email”.
     */
    @JsonProperty("type")
    private String type = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter data
     * data String Optional. Base64-encoded encrypted Telegram Passport element data provided by the user, available for “personal_details”, “passport”, “driver_license”, “identity_card”, “identity_passport” and “address” types. Can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * To setup filter:
     *
     * @see StringFilter phoneNumber
     * phone_number String Optional. User's verified phone number, available only for “phone_number” type
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * To setup filter:
     *
     * @see StringFilter email
     * email String Optional. User's verified email address, available only for “email” type
     */
    @JsonProperty("email")
    private String email = null;
    /**
     * To setup filter:
     *
     * @see PassportFileArrayFilter fileArray
     * files Array of PassportFile Optional. Array of encrypted files with documents provided by the user,
     * available for “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and
     * “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("files")
    private List<PassportFile> files = null;
    /**
     * To setup filter:
     *
     * @see PassportFileFilter frontSide
     * front_side PassportFile Optional. Encrypted file with the front side of the document, provided by the user.
     * Available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted
     * and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("front_side")
    private PassportFile frontSide = null;
    /**
     * To setup filter:
     *
     * @see PassportFileFilter reverseSide
     * reverse_side PassportFile Optional. Encrypted file with the reverse side of the document, provided by the user.
     * Available for “driver_license” and “identity_card”. The file can be decrypted and verified using the accompanying
     * EncryptedCredentials.
     */
    @JsonProperty("reverse_side")
    private PassportFile reverseSide = null;
    /**
     * To setup filter:
     *
     * @see PassportFileFilter selfie
     * selfie PassportFile Optional. Encrypted file with the selfie of the user holding a document, provided by the user; available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("selfie")
    private PassportFile selfie = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PassportFile> getFiles() {
        return files;
    }

    public void setFiles(List<PassportFile> files) {
        this.files = files;
    }

    public PassportFile getFrontSide() {
        return frontSide;
    }

    public void setFrontSide(PassportFile frontSide) {
        this.frontSide = frontSide;
    }

    public PassportFile getReverseSide() {
        return reverseSide;
    }

    public void setReverseSide(PassportFile reverseSide) {
        this.reverseSide = reverseSide;
    }

    public PassportFile getSelfie() {
        return selfie;
    }

    public void setSelfie(PassportFile selfie) {
        this.selfie = selfie;
    }

    public enum Type implements TelegramType {
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
        ALL("");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String stringName() {
            return name;
        }

        @Override

        public boolean isChosen() {
            return this != ALL;
        }

    }
}
