package ru.ioleksiv.telegram.bot.core.model.objects;

import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

public interface IUserFrom extends ITelegram {
    User getFrom();

    void setFrom(User from);
}
