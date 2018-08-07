package ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedsticker>InlineQueryResultCachedSticker</a>
 */
public class InlineQueryResultCachedSticker extends ContentInlineResult {
    private static final String TYPE = "sticker";
    /**
     * sticker_file_id	String	A valid file identifier of the sticker
     */
    @JsonProperty("sticker_file_id")
    private String stickerFileId = null;

    InlineQueryResultCachedSticker() {
        super(TYPE);
    }

    public String getStickerFileId() {
        return stickerFileId;
    }

    public void setStickerFileId(String stickerFileId) {
        this.stickerFileId = stickerFileId;
    }

}
