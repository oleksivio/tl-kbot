package ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.button;

import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * Created by Ilia on 28.03.2018 at 21:10
 * Project: telegrambotcore
 */
public interface IButton extends ITelegram {

    String getText();

    void setText(String text);
}
