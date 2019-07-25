package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.inline.messagecontent.InputMessageContent

abstract class ContentInlineResult : InlineQueryResult() {
    /**
     * input_message_content InputMessageContent Optional. Content of the message to be sent
     */
    @JsonProperty("input_message_content")
    var inputMessageContent: InputMessageContent? = null
}
