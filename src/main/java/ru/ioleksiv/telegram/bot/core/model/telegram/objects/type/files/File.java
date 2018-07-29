package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#files">File</a>
 */
public class File {
    /**
     * file_id	String	Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * file_size	Integer	Optional. File size, if known
     */
    @JsonProperty("file_size")
    private Integer fileSize;
    /**
     * file_path	String	Optional. File path. Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.
     */
    @JsonProperty("file_path")
    private String filePath;

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
