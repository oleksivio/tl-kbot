package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class TitledInlineResult extends FormattedInlineResult {
    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    /**
     * title	String	Title for the result
     */
    @JsonProperty("title")
    private String title = null;

    TitledInlineResult(String type) {
        super(type);
    }
}
