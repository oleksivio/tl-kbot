package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [KeyboardButton](https://core.telegram.org/bots/api/#keyboardbutton)
 */
data class ReplyKeyboardButton(
        /**
         * text String Text of the button. If none of the optional fields are used, it will be sent as a message when the
         * button is pressed
         */
        @JsonProperty("text")
        var text: String? = null,
        /**
         * request_contact Boolean Optional. If True, the user's phone number will be sent as a contact when the button is
         * pressed. Available in private chats only
         */
        @JsonProperty("request_contact")
        var requestContact: Boolean? = null,
        /**
         * request_location Boolean Optional. If True, the user's current location will be sent when the button is pressed.
         * Available in private chats only
         */
        @JsonProperty("request_location")
        var requestLocation: Boolean? = null
) : ITelegram