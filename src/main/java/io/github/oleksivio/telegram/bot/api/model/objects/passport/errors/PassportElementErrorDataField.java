package io.github.oleksivio.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportConstants;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrordatafield">PassportElementErrorDataField</a>
 */
public class PassportElementErrorDataField extends PassportElementError {
    private static final String SOURCE = "data";

    /**
     * field_name String Name of the data field which has the error
     */
    @JsonProperty("field_name")
    private String fieldName = null;
    /**
     * data_hash String Base64-encoded data hash
     */
    @JsonProperty("data_hash")
    private String dataHash = null;

    public PassportElementErrorDataField() {
        super(SOURCE);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDataHash() {
        return dataHash;
    }

    public void setDataHash(String dataHash) {
        this.dataHash = dataHash;
    }

    public void setType(Type type) {
        setType(type.stringName());
    }

    public enum Type {
        PERSONAL_DETAILS(PassportConstants.PERSONAL_DETAILS),
        PASSPORT(PassportConstants.PASSPORT),
        DRIVER_LICENSE(PassportConstants.DRIVER_LICENSE),
        IDENTITY_CARD(PassportConstants.IDENTITY_CARD),
        INTERNAL_PASSPORT(PassportConstants.INTERNAL_PASSPORT),
        ADDRESS(PassportConstants.ADDRESS);

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String stringName() {
            return name;
        }
    }
}
