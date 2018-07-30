package ru.ioleksiv.telegram.bot.core.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorfile>PassportElementErrorFile</a>
 */
public class PassportElementErrorFile extends PassportElementError {
    private static final String SOURCE = "file";

    public static final String TYPE_UTILITY_BILL = UTILITY_BILL;
    public static final String TYPE_BANK_STATEMENT = BANK_STATEMENT;
    public static final String TYPE_RENTAL_AGREEMENT = RENTAL_AGREENENT;
    public static final String TYPE_PASSPORT_REGITRATION = PASSPORT_REGISTRATION;
    public static final String TYPE_TEMPORARY_REGISTRATION = TEMPORARY_REGISTRATION;
    /**
     * file_hash	String	Base64-encoded hash of the file with the front side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash;

    public PassportElementErrorFile() {
        super(SOURCE);
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }
}
