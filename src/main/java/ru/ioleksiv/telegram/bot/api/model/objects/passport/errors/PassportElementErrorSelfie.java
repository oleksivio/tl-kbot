package ru.ioleksiv.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorselfie>PassportElementErrorSelfie</a>
 */
public class PassportElementErrorSelfie extends PassportElementError {
    private static final String SOURCE = "selfie";
    public static final String TYPE_PASSPORT = PASSPORT;
    public static final String TYPE_DRIVER_LICENSE = DRIVER_LICENSE;
    public static final String TYPE_IDENTITY_CARD = IDENTITY_CARD;
    public static final String TYPE_INTERNAL_PASSPORT = INTERNAL_PASSPORT;
    /**
     * file_hash String Base64-encoded hash of the file with the front side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash = null;

    public PassportElementErrorSelfie() {
        super(SOURCE);
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }
}
