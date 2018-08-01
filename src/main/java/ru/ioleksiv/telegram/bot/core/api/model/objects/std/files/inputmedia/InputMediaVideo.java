package ru.ioleksiv.telegram.bot.core.api.model.objects.std.files.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inputmediavideo">InputMediaVideo</a>
 */
public class InputMediaVideo implements InputMedia {
    /**
     * type	String	Type of the result, must be video
     */
    @JsonProperty("type")
    private String type = null;
    /**
     * media	String	File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass "attach://<file_attach_name>" to upload a
     * new one using multipart/form-data under <file_attach_name> name.
     */
    @JsonProperty("media")
    private String media = null;
    /**
     * thumb	InputFile or String	Optional. Thumbnail of the file sent. The thumbnail should be in JPEG format and less
     * than 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded
     * using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass
     * “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    @JsonProperty("thumb")
    private String thumb = null;
    /**
     * caption	String	Optional. Caption of the video to be sent, 0-200 characters
     */
    @JsonProperty("caption")
    private String caption = null;
    /**
     * parse_mode	String	Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;
    /**
     * width	Integer	Optional. Video width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height	Integer	Optional. Video height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * duration	Integer	Optional. Video duration
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * supports_streaming	Boolean	Optional. Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming = null;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getMedia() {
        return media;
    }

    @Override
    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public String getCaption() {
        return caption;
    }

    @Override
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String getParseMode() {
        return parseMode;
    }

    @Override
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getSupportsStreaming() {
        return supportsStreaming;
    }

    public void setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
    }
}
