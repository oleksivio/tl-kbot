package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InlineKeyboardButton implements IButton {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineKeyboardButton.class);

    private String mText = null;
    private String mCallbackData = null;

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

    @JsonProperty("callback_data")
    public String getCallbackData() {
        return mCallbackData;
    }

    @JsonProperty("callback_data")
    public void setCallbackData(String callbackData) {
        mCallbackData = callbackData;
    }

    @Override
    public boolean isValid() {
        return mText != null;
    }
}
