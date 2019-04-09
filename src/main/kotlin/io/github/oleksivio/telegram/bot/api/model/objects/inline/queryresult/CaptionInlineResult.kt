package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

abstract class CaptionInlineResult : ContentInlineResult() {
    /**
     * caption [String] Optional. Caption, 0-200 characters
     */
    @JsonProperty("caption")
    var caption: String? = null
}
