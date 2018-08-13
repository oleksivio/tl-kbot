package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button.ReplyKeyboardButton;

import java.util.Collection;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
public class ReplyKeyboardMarkup extends AbstractKeyboardMarkup<ReplyKeyboardButton> {
    /**
     * resize_keyboard Boolean Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g.,
     * make the keyboard smaller if there are just two rows of buttons). Defaults to false, in which case the custom
     * keyboard is always of the same height as the app's standard keyboard.
     */
    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard = null;
    /**
     * one_time_keyboard Boolean Optional. Requests clients to hide the keyboard as soon as it's been used. The
     * keyboard will still be available, but clients will automatically display the usual letter-keyboard in the chat
     * – the user can press a special button in the input field to see the custom keyboard again. Defaults to false.
     */
    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard = null;
    /**
     * selective Boolean Optional. Use this parameter if you want to show the keyboard to specific users only.
     * Targets:
     * 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    @JsonProperty("selective")
    private Boolean selective = null;

    public Boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    public Boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public Boolean isSelective() {
        return selective;
    }

    /**
     * keyboard Array of Array of KeyboardButton Array of button rows, each represented by an
     * Array of KeyboardButton objects
     */
    @Override
    @JsonProperty("keyboard")
    public List<ButtonRow<ReplyKeyboardButton>> getKeyboard() {
        return super.getKeyboard();
    }

    @Override
    @JsonProperty("keyboard")
    public void setKeyboard(Collection<ButtonRow<ReplyKeyboardButton>> rows) {
        super.setKeyboard(rows);
    }

    public void setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
    }

    public void setOneTimeKeyboard(boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }
}
