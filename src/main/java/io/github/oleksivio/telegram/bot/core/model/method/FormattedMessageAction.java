package io.github.oleksivio.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;

public abstract class FormattedMessageAction extends MessageAction {
    /**
     * parse_mode String Optional Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;

    protected FormattedMessageAction(String method, ActionNetworker actionNetworker) {
        super(method, actionNetworker);
    }

    protected void pSetParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public String getParseMode() {
        return parseMode;
    }

    public abstract FormattedMessageAction setParseMode(String parseMode);

}
