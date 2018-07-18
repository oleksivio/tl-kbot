package ru.ioleksiv.telegram.bot.core.model.telegram.model.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplyKeyboardRemove implements IKeyboard {
    @JsonProperty("remove_keyboard")
    private Boolean mRemoveKeyboard = null;
    @JsonProperty("selective")
    private boolean mSelective = false;

    public boolean isRemoveKeyboard() {
        return mRemoveKeyboard;
    }

    public void setRemoveKeyboard(boolean resizeKeyboard) {
        mRemoveKeyboard = resizeKeyboard;
    }

    public boolean isSelective() {
        return mSelective;
    }

    public void setSelective(Boolean selective) {
        mSelective = selective;
    }

    @Override
    public boolean isValid() {
        return mRemoveKeyboard != null;
    }
}
