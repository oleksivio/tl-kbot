package ru.ioleksiv.telegram.bot.core.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorfiles>PassportElementErrorFiles</a>
 */
public class PassportElementErrorFiles extends PassportElementError {
    private static final String FILES = "files";

    public static final String TYPE_UTILITY_BILL = UTILITY_BILL;
    public static final String TYPE_BANK_STATEMENT = BANK_STATEMENT;
    public static final String TYPE_RENTAL_AGREEMENT = RENTAL_AGREENENT;
    public static final String TYPE_PASSPORT_REGITRATION = PASSPORT_REGISTRATION;
    public static final String TYPE_TEMPORARY_REGISTRATION = TEMPORARY_REGISTRATION;
    /**
     * file_hashes	Array of String	List of base64-encoded file hashes
     */
    @JsonProperty("file_hashes")
    private List<String> fileHashes = new ArrayList<>();

    public PassportElementErrorFiles() {
        super(FILES);
    }

    public List<String> getFileHashes() {
        return fileHashes;
    }

    public void setFileHashes(List<String> fileHashes) {
        this.fileHashes = fileHashes;
    }
}
