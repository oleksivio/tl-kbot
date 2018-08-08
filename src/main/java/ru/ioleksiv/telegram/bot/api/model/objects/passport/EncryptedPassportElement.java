package ru.ioleksiv.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#encryptedpassportelement>EncryptedPassportElement</a>
 */
public class EncryptedPassportElement implements ITelegram {
    public static final String TYPE_PERSONAL_DETAILS = "personal_details";
    public static final String TYPE_PASSPORT = "passport";
    public static final String TYPE_DRIVER_LICENSE = "driver_license";
    public static final String TYPE_IDENTITY_CARD = "identity_card";
    public static final String TYPE_INTERNAL_PASSPORT = "internal_passport";
    public static final String TYPE_ADDRESS = "address";
    public static final String TYPE_UTILITY_BILL = "utility_bill";
    public static final String TYPE_BANK_STATEMENT = "bank_statement";
    public static final String TYPE_RENTAL_AGREEMENT = "rental_agreement";
    public static final String TYPE_PASSPORT_REGISTRATION = "passport_registration";
    public static final String TYPE_TEMPORARY_REGISTRATION = "temporary_registration";
    public static final String TYPE_PHONE_NUMBER = "phone_number";
    public static final String TYPE_EMAIL = "email";
    /**
     * type	String	Element type.
     * One of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”,
     * “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”,
     * “phone_number”, “email”.
     */
    @JsonProperty("type")
    private String type = null;
    /**
     * data	String	Optional. Base64-encoded encrypted Telegram Passport element data provided by the user, available for “personal_details”, “passport”, “driver_license”, “identity_card”, “identity_passport” and “address” types. Can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * phone_number	String	Optional. User's verified phone number, available only for “phone_number” type
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * email	String	Optional. User's verified email address, available only for “email” type
     */
    @JsonProperty("email")
    private String email = null;
    /**
     * files	Array of PassportFile	Optional. Array of encrypted files with documents provided by the user,
     * available for “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and
     * “temporary_registration” types. Files can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("files")
    private List<PassportFile> files = new ArrayList<>();
    /**
     * front_side	PassportFile	Optional. Encrypted file with the front side of the document, provided by the user.
     * Available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted
     * and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("front_side")
    private PassportFile frontSide = null;
    /**
     * reverse_side	PassportFile	Optional. Encrypted file with the reverse side of the document, provided by the user.
     * Available for “driver_license” and “identity_card”. The file can be decrypted and verified using the accompanying
     * EncryptedCredentials.
     */
    @JsonProperty("reverse_side")
    private PassportFile reverseSide = null;
    /**
     * selfie	PassportFile	Optional. Encrypted file with the selfie of the user holding a document, provided by the user; available for “passport”, “driver_license”, “identity_card” and “internal_passport”. The file can be decrypted and verified using the accompanying EncryptedCredentials.
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
}
