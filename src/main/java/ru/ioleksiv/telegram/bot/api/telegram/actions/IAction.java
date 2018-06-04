package ru.ioleksiv.telegram.bot.api.telegram.actions;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IAction extends IApi {

    @JsonIgnore
    boolean isValid();

}
