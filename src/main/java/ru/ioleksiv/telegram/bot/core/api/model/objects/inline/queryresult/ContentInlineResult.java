package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.inline.messagecontent.InputMessageContent;

public abstract class ContentInlineResult extends InlineQueryResult {
    /**
     * input_message_content	InputMessageContent	Optional. Content of the message to be sent
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent = null;

    ContentInlineResult(String type) {
        super(type);
    }

    public final InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public final void setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
    }
}
