package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
public class ReplyKeyboardButton {
    /**
     * text String Text of the button. If none of the optional fields are used, it will be sent as
     * a message when the button is pressed
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * request_contact Boolean Optional. If True, the user's phone number will be sent as a contact
     * when the button is pressed. Available in private chats only
     */
    @JsonProperty("request_contact")
    private Boolean requestContact = null;
    /**
     * request_location Boolean Optional. If True, the user's current location will be sent when the
     * button is pressed. Available in private chats only
     */
    @JsonProperty("request_location")
    private Boolean requestLocation = null;

    private ReplyKeyboardButton() {
    }

    public static ReplyKeyboardButton create() {
        return new ReplyKeyboardButton();
    }

    public String getText() {
        return text;
    }

    public ReplyKeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public ReplyKeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public ReplyKeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }

}
