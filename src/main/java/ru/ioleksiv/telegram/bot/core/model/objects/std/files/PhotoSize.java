package ru.ioleksiv.telegram.bot.core.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
public class PhotoSize {
    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * width	Integer	Photo width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height	Integer	Photo height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * file_size	Integer	Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
