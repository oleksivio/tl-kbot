package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.InlineKeyboardMarkup
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

abstract class InlineQueryResult : ITelegram {
    /**
     * id String Unique identifier for this result, 1-64 bytes
     */
    @JsonProperty("id")
    var id: String? = null
    /**
     * reply_markup InlineKeyboardMarkup Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    var replyMarkup: InlineKeyboardMarkup? = null
}
