package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row.InlineButtonRow

/**
 * @see [InlineKeyboardMarkup](https://core.telegram.org/bots/api.inlinekeyboardmarkup)
 */
data class InlineKeyboardMarkup(
        /**
         * inline_keyboard Array of Array of InlineKeyboardButton Array of button rows, each represented by an Array of
         * InlineKeyboardButton objects
         */
        @JsonProperty("inline_keyboard")
        var inlineKeyboard: MutableList<InlineButtonRow> = mutableListOf(InlineButtonRow())

) : IKeyboard {
    fun add(row: InlineButtonRow) {
        inlineKeyboard.add(row)
    }
}
