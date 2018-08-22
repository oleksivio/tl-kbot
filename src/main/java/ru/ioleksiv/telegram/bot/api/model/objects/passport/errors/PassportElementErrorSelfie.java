package ru.ioleksiv.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorselfie>PassportElementErrorSelfie</a>
 */
public class PassportElementErrorSelfie extends PassportElementError {
    private static final String SOURCE = "selfie";

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

    public void setType(Type type) {
        setType(type.stringName());
    }

    public enum Type {
        PASSPORT(ErrorConstants.PASSPORT),
        DRIVER_LICENSE(ErrorConstants.DRIVER_LICENSE),
        IDENTITY_CARD(ErrorConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(ErrorConstants.INTERNAL_PASSPORT);

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String stringName() {
            return name;
        }
    }
}
