package ru.ioleksiv.telegram.bot.api.telegram.model.keyboard.button;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.telegram.IOutputObject;

/**
 * Created by Ilia on 28.03.2018 at 21:10
 * Project: telegrambotcore
 */
public interface IButton extends IOutputObject {

    String getText();

    void setText(String text);
}
