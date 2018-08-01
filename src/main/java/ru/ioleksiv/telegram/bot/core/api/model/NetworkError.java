package ru.ioleksiv.telegram.bot.core.api.model;

public interface NetworkError {

    void onServerError(ErrorResponse error);
}
