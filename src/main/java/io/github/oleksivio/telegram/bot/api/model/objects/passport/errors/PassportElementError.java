package io.github.oleksivio.telegram.bot.api.model.objects.passport.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

public abstract class PassportElementError implements ITelegram {

    @JsonProperty("source")
    private final String source;
    /**
     * type String The section of the user's Telegram Passport which has the error
     */
    @JsonProperty("type")
    private String type = null;
    /**
     * message String Error message
     */
    @JsonProperty("message")
    private String message = null;

    protected PassportElementError(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
