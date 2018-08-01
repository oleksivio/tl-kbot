package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class FormattedInlineResult extends CaptionInlineResult {
    /**
     * parse_mode	String	Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;

    FormattedInlineResult(String type) {
        super(type);
    }

    public final String getParseMode() {
        return parseMode;
    }

    public final void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

}
