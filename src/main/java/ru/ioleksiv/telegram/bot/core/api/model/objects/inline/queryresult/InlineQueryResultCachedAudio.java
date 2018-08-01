package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedaudio>InlineQueryResultCachedAudio</a>
 */
public class InlineQueryResultCachedAudio extends FormattedInlineResult {
    private static final String TYPE = "audio";
    /**
     * audio_file_id	String	A valid file identifier for the audio file
     */
    @JsonProperty("audio_file_id")
    private String audioFileId = null;

    InlineQueryResultCachedAudio() {
        super(TYPE);
    }

    public String getAudioFileId() {
        return audioFileId;
    }

    public void setAudioFileId(String audioFileId) {
        this.audioFileId = audioFileId;
    }

}
