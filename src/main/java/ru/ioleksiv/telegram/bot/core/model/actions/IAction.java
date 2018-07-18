package ru.ioleksiv.telegram.bot.core.model.actions;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IAction extends IServerApi {

    @JsonIgnore
    boolean isValid();

}
