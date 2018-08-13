package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
public class ReplyKeyboardButton implements IButton {
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

    public Boolean getRequestContact() {
        return requestContact;
    }

    public void setRequestContact(boolean requestContact) {
        this.requestContact = requestContact;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(boolean requestLocation) {
        this.requestLocation = requestLocation;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}
