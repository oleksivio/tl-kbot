package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard;

import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.button.ButtonRow;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.button.IButton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ilia on 28.03.2018 at 23:28
 * Project: telegrambotcore
 */
public class AbstractKeyboardMarkup<T extends IButton> implements IKeyboard {

    private final List<ButtonRow<T>> keyboard = new ArrayList<>(new ArrayList<>());

    public void addRow(ButtonRow<T> row) {
        keyboard.add(row);
    }

    public void removeRow(ButtonRow<T> row) {
        keyboard.remove(row);
    }

    protected List<ButtonRow<T>> getRows() {
        return new ArrayList<>(keyboard);
    }

    protected void setRows(Collection<ButtonRow<T>> rows) {
        keyboard.clear();
        keyboard.addAll(rows);
    }


}
