package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.CallbackGame
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [InlineKeyboardButton](https://core.telegram.org/bots/api/#inlinekeyboardbutton)
 */
data class InlineKeyboardButton(
        /**
         * text String Label text on the button
         */
        @JsonProperty("text")
        var text: String,
        /**
         * url [String] Optional. HTTP url to be opened when button is pressed
         */
        @JsonProperty("url")
        var url: String? = null,
        /**
         * callback_data [String] Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes
         */
        @JsonProperty("callback_data")
        var callbackData: String? = null,
        /**
         * switch_inline_query [String] Optional. If set, pressing the button will prompt the user to select one of their chats,
         * open that chat and insert the bot‘s username and the specified inline query in the input field. Can be empty, in
         * which case just the bot’s username will be inserted.
         */
        @JsonProperty("switch_inline_query")
        var switchInlineQuery: String? = null,
        /**
         * switch_inline_query_current_chat [String] Optional. If set, pressing the button will insert the bot‘s username and
         * the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username
         * will be inserted.
         */
        @JsonProperty("switch_inline_query_current_chat")
        var switchInlineQueryCurrentChat: String? = null,
        /**
         * callback_game CallbackGame Optional. Description of the game that will be launched when the user presses the
         * button.
         */
        @JsonProperty("callback_game")
        var callbackGame: CallbackGame? = null,
        /**
         * pay Boolean Optional. Specify True, to send a Pay button.
         */
        @JsonProperty("pay")
        var pay: Boolean? = null
) : ITelegram


