package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.FileAction;

/**
 * @param <T> File or String
 * @link https://core.telegram.org/bots/api#sendaudio
 */
public class SendAudio<T> extends FileAction {
    private static final String METHOD = "sendAudio";
    /**
     * audio	InputFile or String	 Yes	Audio file to send. Pass a file_id as String to send an
     * audio file that exists on the Telegram servers (recommended), pass an HTTP URL as a String
     * for Telegram to get an audio file from the Internet, or upload a new
     * one using multipart/form-data.
     */
    @JsonProperty("audio")
    private T audio = null;

    /**
     * duration	Integer	Optional	Duration of the audio in seconds
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * performer	String	Optional	Performer
     */
    @JsonProperty("performer")
    private String performer;
    /**
     * title	String	Optional	Track name
     */
    @JsonProperty("title")
    private String title;

    public SendAudio(Networker networker) {
        super(METHOD, networker);
    }

    public Integer getDuration() {
        return duration;
    }

    public SendAudio<T> setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public SendAudio<T> setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SendAudio<T> setTitle(String title) {
        this.title = title;
        return this;
    }

    public T getAudio() {
        return audio;
    }

    public SendAudio<T> setAudio(T audio) {
        this.audio = audio;
        return this;
    }

}
