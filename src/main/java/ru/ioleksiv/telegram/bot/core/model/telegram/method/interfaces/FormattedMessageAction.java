package ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public   class FormattedMessageAction  extends MessageAction  {
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;

    protected FormattedMessageAction(String method, Networker networker) {
        super(method, networker);
    }

    public String getParseMode() {
        return parseMode;
    }

    public FormattedMessageAction setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

}
