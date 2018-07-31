package ru.ioleksiv.telegram.bot.core.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportelementerrordatafield>PassportElementErrorDataField</a>
 */
public class PassportElementErrorDataField extends PassportElementError {
    private static final String SOURCE = "data";

    public static final String TYPE_PERSONAL_DETAILS = PERSONAL_DETAILS;
    public static final String TYPE_PASSPORT = PASSPORT;
    public static final String TYPE_DRIVER_LICENSE = DRIVER_LICENSE;
    public static final String TYPE_IDENTITY_CARD = IDENTITY_CARD;
    public static final String TYPE_INTERNAL_PASSPORT = INTERNAL_PASSPORT;
    public static final String TYPE_ADDRESS = ADDRESS;

    /**
     * field_name	String	Name of the data field which has the error
     */
    @JsonProperty("field_name")
    private String fieldName = null;
    /**
     * data_hash	String	Base64-encoded data hash
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
}
