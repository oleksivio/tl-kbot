package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard;

import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.button.IButton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ilia on 28.03.2018 at 23:28
 * Project: telegrambotcore
 */
public class AbstractKeyboardMarkup<T extends IButton> implements IKeyboard {
    private final List<ButtonRow<T>> mKeyboard = new ArrayList<>(new ArrayList<>());

    public void addRow(ButtonRow<T> row) {
        mKeyboard.add(row);
    }

    public void removeRow(ButtonRow<T> row) {
        mKeyboard.remove(row);
    }

    protected List<ButtonRow<T>> getRows() {
        return new ArrayList<>(mKeyboard);
    }

    protected void setRows(Collection<ButtonRow<T>> rows) {
        mKeyboard.clear();
        mKeyboard.addAll(rows);
    }

    @Override
    public boolean isValid() {
        if (mKeyboard.isEmpty()) {
            return false;
        }

        for (ButtonRow<T> rows : mKeyboard) {
            if (!rows.isValid()) {
                return false;
            }
        }

        return true;
    }
}
