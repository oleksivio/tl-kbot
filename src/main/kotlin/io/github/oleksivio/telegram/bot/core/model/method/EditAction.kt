package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker

abstract class EditAction<RES> protected constructor(method: String, actionNetworker: ActionNetworker) : ChatAction<RES>(method, actionNetworker) {
    /**
     * reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for a new inline
     * keyboard.
     */
    @JsonProperty("reply_markup")
    var inlineKeyboardMarkup: InlineKeyboardMarkup? = null
    /**
     * message_id Integer Optional Required if inline_message_id is not specified. Identifier
     * of the sent message
     */
    @JsonProperty("message_id")
    var messageId: Long? = null
    /**
     * inline_message_id String Optional Required if chat_id and message_id are not specified.
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    var inlineMessageId: String? = null
}
