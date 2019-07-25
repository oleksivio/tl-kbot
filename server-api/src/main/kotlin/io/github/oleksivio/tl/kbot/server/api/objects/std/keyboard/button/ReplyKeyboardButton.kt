package io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.button

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [KeyboardButton](https://core.telegram.org/bots/api/#keyboardbutton)
 */
data class ReplyKeyboardButton(
    /**
     * text String Text of the button. If none of the optional fields are used, it will be sent as a message when the
     * button is pressed
     */
    @JsonProperty("text")
    var text: String,
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
