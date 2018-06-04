package ru.ioleksiv.telegram.bot.api.telegram.model.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

import ru.ioleksiv.telegram.bot.api.telegram.model.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.api.telegram.model.keyboard.button.InlineKeyboardButton;

public class InlineKeyboardMarkup extends AbstractKeyboardMarkup<InlineKeyboardButton> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineKeyboardMarkup.class);

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
