package ru.ioleksiv.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorreverseside>PassportElementErrorReverseSide</a>
 */
public class PassportElementErrorReverseSide extends PassportElementError {
    private static final String SOURCE = "reverse_side";

    /**
     * file_hash String Base64-encoded hash of the file with the reverse side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash = null;

    public PassportElementErrorReverseSide() {
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
        DRIVER_LICENSE(ErrorConstants.DRIVER_LICENSE),
        IDENTITY_CARD(ErrorConstants.IDENTITY_CARD);
        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String stringName() {
            return name;
        }
    }

}
