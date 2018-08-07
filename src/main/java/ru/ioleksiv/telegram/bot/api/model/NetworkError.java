package ru.ioleksiv.telegram.bot.api.model;

public interface NetworkError {

    void onServerError(ErrorResponse error);
}
