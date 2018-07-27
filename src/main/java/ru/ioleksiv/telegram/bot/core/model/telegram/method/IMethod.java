package ru.ioleksiv.telegram.bot.core.model.telegram.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.IAction;

public interface IMethod<RES> extends IAction<RES> {
    @JsonProperty("method")
    String getMethod();
}
