package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultaudio>InlineQueryResultAudio</a>
 */
public class InlineQueryResultAudio extends TitledInlineResult {
    private static final String TYPE = "audio";
    /**
     * audio_url	String	A valid URL for the audio file
     */
    @JsonProperty("audio_url")
    private String audioUrl = null;

    /**
     * performer	String	Optional. Performer
     */
    @JsonProperty("performer")
    private String performer = null;
    /**
     * audio_duration	Integer	Optional. Audio duration in seconds
     */
    @JsonProperty("audio_duration")
    private Integer audioDuration = null;

    InlineQueryResultAudio() {
        super(TYPE);
    }



    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }



    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public Integer getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
    }

}
