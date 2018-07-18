package ru.ioleksiv.telegram.bot.core.model.telegram.model.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.keyboard.button.ReplyKeyboardButton;

import java.util.Collection;
import java.util.List;

public class ReplyKeyboardMarkup extends AbstractKeyboardMarkup<ReplyKeyboardButton> {
    private Boolean mResizeKeyboard = null;
    private Boolean mOneTimeKeyboard = null;
    private Boolean mSelective = null;

    @Override
    @JsonProperty("keyboard")
    public List<ButtonRow<ReplyKeyboardButton>> getRows() {
        return super.getRows();
    }

    @Override
    @JsonProperty("keyboard")
    public void setRows(Collection<ButtonRow<ReplyKeyboardButton>> rows) {
        super.setRows(rows);
    }

    @JsonProperty("resize_keyboard")
    public boolean isResizeKeyboard() {
        return mResizeKeyboard;
    }

    @JsonProperty("resize_keyboard")
    public void setResizeKeyboard(boolean resizeKeyboard) {
        mResizeKeyboard = resizeKeyboard;
    }

    @JsonProperty("one_time_keyboard")
    public boolean isOneTimeKeyboard() {
        return mOneTimeKeyboard;
    }

    @JsonProperty("one_time_keyboard")
    public void setOneTimeKeyboard(boolean oneTimeKeyboard) {
        mOneTimeKeyboard = oneTimeKeyboard;
    }

    @JsonProperty("selective")
    public boolean isSelective() {
        return mSelective;
    }

    @JsonProperty("selective")
    public void setSelective(Boolean selective) {
        mSelective = selective;
    }
}
