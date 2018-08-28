package io.github.oleksivio.telegram.bot.api.model.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#passportfile>PassportFile</a>
 */
public class PassportFile implements ITelegram {
    /**
     * file_id String Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileSize
     * file_size Integer File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileDate
     * file_date Integer Unix time when the file was uploaded
     */
    @JsonProperty("file_date")
    private Integer fileDate = null;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileDate() {
        return fileDate;
    }

    public void setFileDate(Integer fileDate) {
        this.fileDate = fileDate;
    }
}
