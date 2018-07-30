package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.IAction;

public interface IMethod<RES> extends IAction<RES> {
    @JsonProperty("method")
    String getMethod();
}
