package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row.InlineButtonRow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">InlineKeyboardMarkup</a>
 */
public class InlineKeyboardMarkup implements IKeyboard {
    /**
     * inline_keyboard Array of Array of InlineKeyboardButton Array of button rows, each
     * represented by an Array of InlineKeyboardButton objects
     */
    @JsonProperty("inline_keyboard")
    private List<InlineButtonRow> inlineKeyboard = new ArrayList<>(new ArrayList<>());

    private InlineKeyboardMarkup() {
    }

    public static InlineKeyboardMarkup create() {
        return new InlineKeyboardMarkup();
    }

    public InlineKeyboardMarkup add(InlineButtonRow row) {
        inlineKeyboard.add(row);
        return this;
    }

    public List<InlineButtonRow> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public InlineKeyboardMarkup setInlineKeyboard(List<InlineButtonRow> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
        return this;
    }
}
