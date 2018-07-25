package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.FileAction;

/**
 * @link https://core.telegram.org/bots/api#sendvideonote
 */
public class SendVideoNote<T> extends FileAction {
    private static final String METHOD = "sendVideoNote";
    /**
     * video_note	InputFile or String	Yes	Video note to send. Pass a file_id as String to send a
     * video note that exists on the Telegram servers (recommended) or upload a new video using
     * multipart/form-data. More info on Sending Files ». Sending video notes by a URL is currently
     * unsupported
     */
    @JsonProperty("video_note")
    private T videoNote = null;
    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * length	Integer	Optional	Video width and height
     */
    @JsonProperty("length")
    private Integer length;

    public SendVideoNote(Networker networker) {
        super(METHOD, networker);
    }

    public Integer getLength() {
        return length;
    }

    public SendVideoNote<T> setLength(Integer length) {
        this.length = length;
        return this;
    }

    public T getVideoNote() {
        return videoNote;
    }

    public SendVideoNote<T> setVideoNote(T videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVideoNote<T> setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
}
