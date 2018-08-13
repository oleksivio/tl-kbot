package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#chatphoto">ChatPhoto</a>
 */
public class ChatPhoto implements ITelegram {
    /**
     * small_file_id String Unique file identifier of small (160x160) chat photo. This file_id
     * can be used only for photo download.
     */
    @JsonProperty("small_file_id")
    private String smallFileId = null;
    /**
     * big_file_id String Unique file identifier of big (640x640) chat photo. This file_id can be
     * used only for photo download.
     */
    @JsonProperty("big_file_id")
    private String bigFileId = null;

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
