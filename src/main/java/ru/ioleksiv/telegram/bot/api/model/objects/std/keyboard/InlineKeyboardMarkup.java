package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button.InlineKeyboardButton;

import java.util.Collection;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinekeyboardmarkup">InlineKeyboardMarkup</a>
 */
public class InlineKeyboardMarkup extends AbstractKeyboardMarkup<InlineKeyboardButton> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineKeyboardMarkup.class);

    /**
     * inline_keyboard	Array of Array of InlineKeyboardButton	Array of button rows, each
     * represented by an Array of InlineKeyboardButton objects
     */

    @Override
    @JsonProperty("inline_keyboard")
    public List<ButtonRow<InlineKeyboardButton>> getRows() {
        return super.getRows();
    }

    @Override
    @JsonProperty("inline_keyboard")
    public void setRows(Collection<ButtonRow<InlineKeyboardButton>> rows) {
        super.setRows(rows);
    }

}
