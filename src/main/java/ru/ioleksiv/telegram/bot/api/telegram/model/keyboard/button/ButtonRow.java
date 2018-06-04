package ru.ioleksiv.telegram.bot.api.telegram.model.keyboard.button;

import java.util.ArrayList;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.telegram.IOutputObject;

/**
 * Created by Ilia on 28.03.2018 at 21:09
 * Project: telegrambotcore
 */
public class ButtonRow<T extends IButton> extends ArrayList<T> implements IOutputObject {

    @Override
    public boolean isValid() {
        for (T button : this) {
            if (!button.isValid()) {
                return false;
            }
        }
        return true;
    }
}
