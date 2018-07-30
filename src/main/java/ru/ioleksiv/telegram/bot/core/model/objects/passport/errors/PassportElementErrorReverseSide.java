package ru.ioleksiv.telegram.bot.core.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorreverseside>PassportElementErrorReverseSide</a>
 */
public class PassportElementErrorReverseSide extends PassportElementError {
    public static final String TYPE_DRIVER_LICENSE = DRIVER_LICENSE;
    public static final String TYPE_IDENTITY_CARD = IDENTITY_CARD;


    private static final String SOURCE = "reverse_side";
    /**
     * file_hash	String	Base64-encoded hash of the file with the reverse side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash;

    public PassportElementErrorReverseSide() {
        super(SOURCE);
    }


    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }
}
