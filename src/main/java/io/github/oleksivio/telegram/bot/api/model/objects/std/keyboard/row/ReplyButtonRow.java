package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.row;

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button.ReplyKeyboardButton;

import java.util.ArrayList;

/**
 * Created by Ilia on 28.03.2018 at 21:09
 * Project: telegrambotcore
 */
public class ReplyButtonRow extends ArrayList<ReplyKeyboardButton> {

    private ReplyButtonRow() {
    }

    public static ReplyButtonRow create() {
        return new ReplyButtonRow();
    }

    public ReplyButtonRow addToRight(ReplyKeyboardButton button) {
        add(button);
        return this;
    }

    public ReplyButtonRow addToLeft(ReplyKeyboardButton button) {
        add(0, button);
        return this;
    }
}
