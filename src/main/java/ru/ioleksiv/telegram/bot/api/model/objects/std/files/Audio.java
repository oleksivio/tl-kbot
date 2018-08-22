package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#audio">Audio</a>
 */
public class Audio implements ITelegram {

    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter duration
     * duration Integer Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * To setup filter:
     *
     * @see StringFilter performer
     * performer String Optional. Performer of the audio as defined by sender or by audio tags
     */
    @JsonProperty("performer")
    private String performer = null;
    /**
     * To setup filter:
     *
     * @see StringFilter title
     * title String Optional. Title of the audio as defined by sender or by audio tags
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * To setup filter:
     *
     * @see StringFilter mimeType
     * mime_type String Optional. MIME type of the files as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileSize
     * file_size Integer Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;
    /**
     * To setup filter:
     *
     * @see PhotoFilter thumb
     * thumb PhotoSize Optional. Thumbnail of the album cover to which the music file belongs
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
