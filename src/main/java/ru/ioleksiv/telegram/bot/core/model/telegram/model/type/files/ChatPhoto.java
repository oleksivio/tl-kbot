package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#chatphoto
 */
public class ChatPhoto {
    /**
     * small_file_id	String	Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download.
     */
    @JsonProperty("small_file_id")
    private String smallFileId;
    /**
     * big_file_id	String	Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    @JsonProperty("big_file_id")
    private String bigFileId;

    public String getSmallFileId() {
        return smallFileId;
    }

    public void setSmallFileId(String smallFileId) {
        this.smallFileId = smallFileId;
    }

    public String getBigFileId() {
        return bigFileId;
    }

    public void setBigFileId(String bigFileId) {
        this.bigFileId = bigFileId;
    }
}
