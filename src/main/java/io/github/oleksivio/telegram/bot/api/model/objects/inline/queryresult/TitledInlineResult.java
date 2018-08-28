package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class TitledInlineResult extends FormattedInlineResult {
    /**
     * title String Title for the result
     */
    @JsonProperty("title")
    private String title = null;

    TitledInlineResult(String type) {
        super(type);
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }
}
