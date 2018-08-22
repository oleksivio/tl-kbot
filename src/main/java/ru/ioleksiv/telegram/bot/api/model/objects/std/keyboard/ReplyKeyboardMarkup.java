package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.row.ReplyButtonRow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
public class ReplyKeyboardMarkup implements IKeyboard {
    /**
     * keyboard Array of Array of KeyboardButton Array of button rows, each represented by an
     * Array of KeyboardButton objects
     */
    @JsonProperty("keyboard")
    private List<ReplyButtonRow> keyboard = new ArrayList<>(new ArrayList<>());
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

    private ReplyKeyboardMarkup() {
    }

    public static ReplyKeyboardMarkup create() {
        return new ReplyKeyboardMarkup();
    }

    public ReplyKeyboardMarkup addRow(ReplyButtonRow row) {
        keyboard.add(row);
        return this;
    }

    public Boolean getResizeKeyboard() {
        return resizeKeyboard;
    }

    public ReplyKeyboardMarkup setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    public Boolean getOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public ReplyKeyboardMarkup setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    public Boolean getSelective() {
        return selective;
    }

    public ReplyKeyboardMarkup setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    public List<ReplyButtonRow> getKeyboard() {
        return keyboard;
    }

    public ReplyKeyboardMarkup setKeyboard(List<ReplyButtonRow> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

}
