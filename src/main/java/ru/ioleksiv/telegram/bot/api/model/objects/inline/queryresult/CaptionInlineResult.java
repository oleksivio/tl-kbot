package ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CaptionInlineResult extends ContentInlineResult {
    /**
     * caption	String	Optional. Caption, 0-200 characters
     */
    @JsonProperty("caption")
    private String caption = null;

    CaptionInlineResult(String type) {
        super(type);
    }

    public final String getCaption() {
        return caption;
    }

    public final void setCaption(String caption) {
        this.caption = caption;
    }
}
