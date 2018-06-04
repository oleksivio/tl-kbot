package ru.ioleksiv.telegram.bot.api.telegram.interfaces.telegram;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.ITelegram;

public interface IOutputObject extends ITelegram {
    @JsonIgnore
    boolean isValid();
}
