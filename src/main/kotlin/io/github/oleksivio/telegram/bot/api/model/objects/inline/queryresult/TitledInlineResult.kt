package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

abstract class TitledInlineResult : FormattedInlineResult() {
    /**
     * title String Title for the result
     */
    @JsonProperty("title")
    var title: String? = null
}
