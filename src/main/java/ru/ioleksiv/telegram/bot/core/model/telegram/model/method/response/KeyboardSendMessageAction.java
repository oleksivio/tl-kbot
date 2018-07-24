package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.IKeyboard;

public class KeyboardSendMessageAction extends SendMessageApi {
    private IKeyboard mKeyboard = null;

    @JsonProperty("reply_markup")
    public IKeyboard getKeyboard() {
        return mKeyboard;
    }

    @JsonProperty("reply_markup")
    public void setKeyboard(IKeyboard replyMarkup) {
        mKeyboard = replyMarkup;
    }

    @JsonIgnore
    @Override
    public boolean isValid() {
        return super.isValid() && mKeyboard != null;
    }

}
