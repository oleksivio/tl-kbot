package ru.ioleksiv.telegram.bot.core.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorfrontside>PassportElementErrorFrontSide</a>
 */
public class PassportElementErrorFrontSide extends PassportElementError {
    private static final String SOURCE = "front_side";

    public static final String TYPE_PASSPORT = PASSPORT;
    public static final String TYPE_DRIVER_LICENSE = DRIVER_LICENSE;
    public static final String TYPE_IDENTITY_CARD = IDENTITY_CARD;
    public static final String TYPE_INTERNAL_PASSPORT = INTERNAL_PASSPORT;
    /**
     * file_hash	String	Base64-encoded hash of the file with the front side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash = null;

    /**
     * type	String	The section of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”,
     * “identity_card”, “internal_passport”
     */
    public PassportElementErrorFrontSide() {
        super(SOURCE);
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }
}
