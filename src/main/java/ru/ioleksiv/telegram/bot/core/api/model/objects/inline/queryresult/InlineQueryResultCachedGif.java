package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedgif>InlineQueryResultCachedGif</a>
 */
public class InlineQueryResultCachedGif extends TitledInlineResult {
    private static final String TYPE = "gif";
    /**
     * gif_file_id	String	A valid file identifier for the GIF file
     */
    @JsonProperty("gif_file_id")
    private String gifFileId = null;

    InlineQueryResultCachedGif() {
        super(TYPE);
    }

    public String getGifFileId() {
        return gifFileId;
    }

    public void setGifFileId(String gifFileId) {
        this.gifFileId = gifFileId;
    }

}

