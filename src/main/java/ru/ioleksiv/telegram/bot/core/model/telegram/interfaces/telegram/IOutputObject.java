package ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.telegram;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

public interface IOutputObject extends ITelegram {
    @JsonIgnore
    boolean isValid();
}
