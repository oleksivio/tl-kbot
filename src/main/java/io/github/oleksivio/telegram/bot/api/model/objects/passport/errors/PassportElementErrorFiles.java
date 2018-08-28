package io.github.oleksivio.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorfiles">PassportElementErrorFiles</a>
 */
public class PassportElementErrorFiles extends PassportElementError {
    private static final String FILES = "files";

    /**
     * file_hashes Array of String List of base64-encoded file hashes
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

    public void setType(Type type) {
        setType(type.stringName());
    }

    public enum Type {
        UTILITY_BILL(PassportConstants.UTILITY_BILL),
        BANK_STATEMENT(PassportConstants.BANK_STATEMENT),
        RENTAL_AGREENENT(PassportConstants.RENTAL_AGREENENT),
        PASSPORT_REGISTRATION(PassportConstants.PASSPORT_REGISTRATION),
        TEMPORARY_REGISTRATION(PassportConstants.TEMPORARY_REGISTRATION);

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String stringName() {
            return name;
        }
    }
}
