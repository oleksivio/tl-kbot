package ru.ioleksiv.telegram.bot.core.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#audio">Audio</a>
 */
public class Audio {

    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * duration	Integer	Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * performer	String	Optional. Performer of the audio as defined by sender or by audio tags
     */
    @JsonProperty("performer")
    private String performer = null;
    /**
     * title	String	Optional. Title of the audio as defined by sender or by audio tags
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * mime_type	String	Optional. MIME type of the files as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * file_size	Integer	Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;
    /**
     * thumb	PhotoSize	Optional. Thumbnail of the album cover to which the music file belongs
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
