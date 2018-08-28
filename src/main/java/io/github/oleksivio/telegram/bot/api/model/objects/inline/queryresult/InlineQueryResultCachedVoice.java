package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedvoice">InlineQueryResultCachedVoice</a>
 */
public class InlineQueryResultCachedVoice extends TitledInlineResult {
    private static final String TYPE = "voice";

    /**
     * voice_file_id String A valid file identifier for the voice message
     */
    @JsonProperty("voice_file_id")
    private String voiceFileId = null;

    InlineQueryResultCachedVoice() {
        super(TYPE);
    }

    public String getVoiceFileId() {
        return voiceFileId;
    }

    public void setVoiceFileId(String voiceFileId) {
        this.voiceFileId = voiceFileId;
    }
}
