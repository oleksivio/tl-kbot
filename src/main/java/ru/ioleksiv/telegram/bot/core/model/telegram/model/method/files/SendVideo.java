package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.FileAction;

/**
 * @param <T> File or String
 * @link https://core.telegram.org/bots/api#sendvideo
 */
public class SendVideo<T> extends FileAction {
    private static final String METHOD = "sendVideo";
    /**
     * video	InputFile or String	Yes	Video to send. Pass a file_id as String to send a video that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a video from the Internet, or upload a new video using multipart/form-data.
     */
    @JsonProperty("video")
    private T video = null;

    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * width	Integer	Optional	Video width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height	Integer	Optional	Video height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * supports_streaming	Boolean	Optional	Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming = null;

    public SendVideo(Networker networker) {
        super(METHOD, networker);
    }

    public T getVideo() {
        return video;
    }

    public SendVideo<T> setVideo(T video) {
        this.video = video;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVideo<T> setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SendVideo<T> setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SendVideo<T> setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getSupportsStreaming() {
        return supportsStreaming;
    }

    public SendVideo<T> setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }
}
