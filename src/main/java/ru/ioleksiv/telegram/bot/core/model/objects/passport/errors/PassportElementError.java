package ru.ioleksiv.telegram.bot.core.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class PassportElementError {
    protected static final String PERSONAL_DETAILS = "personal_details";
    protected static final String PASSPORT = "passport";
    protected static final String DRIVER_LICENSE = "driver_license";
    protected static final String IDENTITY_CARD = "identity_card";
    protected static final String INTERNAL_PASSPORT = "internal_passport";
    protected static final String ADDRESS = "address";

    protected static final String UTILITY_BILL = "utility_bill";
    protected static final String BANK_STATEMENT = "bank_statement";
    protected static final String RENTAL_AGREENENT = "rental_agreement";
    protected static final String PASSPORT_REGISTRATION = "passport_registration";
    protected static final String TEMPORARY_REGISTRATION = "temporary_registration";

    @JsonProperty("source")
    private final String source;
    /**
     * type	String	The section of the user's Telegram Passport which has the error
     */
    @JsonProperty("type")
    private String type;
    /**
     * message	String	Error message
     */
    @JsonProperty("message")
    private String message;

    protected PassportElementError(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
