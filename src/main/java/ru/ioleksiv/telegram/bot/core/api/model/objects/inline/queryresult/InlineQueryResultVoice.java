package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultvoice>InlineQueryResultVoice</a>
 */
public class InlineQueryResultVoice extends TitledInlineResult {
    public static final String TYPE = "voice";
    /**
     * voice_url	String	A valid URL for the voice recording
     */
    @JsonProperty("voice_url")
    private String voiceUrl = null;

    /**
     * voice_duration	Integer	Optional. Recording duration in seconds
     */
    @JsonProperty("voice_duration")
    private Integer voiceDuration = null;

    InlineQueryResultVoice() {
        super(TYPE);
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public Integer getVoiceDuration() {
        return voiceDuration;
    }

    public void setVoiceDuration(Integer voiceDuration) {
        this.voiceDuration = voiceDuration;
    }
}
