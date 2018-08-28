package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row;

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button.InlineKeyboardButton;

import java.util.ArrayList;

/**
 * Created by Ilia on 28.03.2018 at 21:09
 * Project: telegrambotcore
 */
public class InlineButtonRow extends ArrayList<InlineKeyboardButton> {

    private InlineButtonRow() {
    }

    public static InlineButtonRow create() {
        return new InlineButtonRow();
    }

    public InlineButtonRow addToRight(InlineKeyboardButton button) {
        add(button);
        return this;
    }

    public InlineButtonRow addToLeft(InlineKeyboardButton button) {
        add(0, button);
        return this;
    }
}
