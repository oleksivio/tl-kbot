package ru.ioleksiv.telegram.bot.core.model.telegram.model.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplyKeyboardButton implements IButton {
    @JsonProperty("text")
    private String mText = null;
    @JsonProperty("request_contact")
    private boolean mRequestContact = false;
    @JsonProperty("request_location")
    private boolean mRequestLocation = false;

    public boolean isRequestContact() {
        return mRequestContact;
    }

    public void setRequestContact(boolean requestContact) {
        mRequestContact = requestContact;
    }

    public boolean isRequestLocation() {
        return mRequestLocation;
    }

    public void setRequestLocation(boolean requestLocation) {
        mRequestLocation = requestLocation;
    }

    @Override
    @JsonProperty("text")
    public String getText() {
        return mText;
    }

    @Override
    @JsonProperty("text")
    public void setText(String text) {
        mText = text;
    }

    @Override
    public boolean isValid() {
        return mText != null;
    }
}
