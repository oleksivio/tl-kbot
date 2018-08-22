package ru.ioleksiv.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportConstants;
import ru.ioleksiv.telegram.bot.core.model.type.NamedType;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrorfrontside>PassportElementErrorFrontSide</a>
 */
public class PassportElementErrorFrontSide extends PassportElementError {
    private static final String SOURCE = "front_side";

    /**
     * file_hash String Base64-encoded hash of the file with the front side of the document
     */
    @JsonProperty("file_hash")
    private String fileHash = null;

    /**
     * type String The section of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”,
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

    public void setType(Type type) {
        setType(type.stringName());
    }

    public enum Type implements NamedType {
        PASSPORT(PassportConstants.PASSPORT),
        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(PassportConstants.INTERNAL_PASSPORT);

        private final String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String stringName() {
            return name;
        }
    }
}
