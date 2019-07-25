package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

abstract class FormattedInlineResult : CaptionInlineResult() {
    /**
     * parse_mode [String] Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text
     * or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    var parseMode: String? = null
}
