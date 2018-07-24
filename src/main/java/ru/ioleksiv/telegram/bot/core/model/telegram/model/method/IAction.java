package ru.ioleksiv.telegram.bot.core.model.telegram.model.method;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IAction extends IServerApi {

    @JsonIgnore
    boolean isValid();

}
