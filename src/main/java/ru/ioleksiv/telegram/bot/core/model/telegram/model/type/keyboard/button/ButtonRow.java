package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.button;

import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.telegram.IOutputObject;

import java.util.ArrayList;

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
