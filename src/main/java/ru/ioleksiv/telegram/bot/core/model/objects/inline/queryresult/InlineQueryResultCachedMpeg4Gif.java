package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedmpeg4gif>InlineQueryResultCachedMpeg4Gif</a>
 */
public class InlineQueryResultCachedMpeg4Gif extends TitledInlineResult {
    private static final String TYPE = "mpeg4_gif";
    /**
     * mpeg4_file_id	String	A valid file identifier for the MP4 file
     */
    @JsonProperty("mpeg4_file_id")
    private String mpeg4FileId;

    InlineQueryResultCachedMpeg4Gif() {
        super(TYPE);
    }

    public String getMpeg4FileId() {
        return mpeg4FileId;
    }

    public void setMpeg4FileId(String mpeg4FileId) {
        this.mpeg4FileId = mpeg4FileId;
    }
}
