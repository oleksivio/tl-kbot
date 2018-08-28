package io.github.oleksivio.telegram.bot.api.model;

public interface NetworkError {

    void onServerError(ErrorResponse error);
}
