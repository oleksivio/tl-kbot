package io.github.oleksivio.telegram.bot.api.controller;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;

public interface UpdateErrorListener {

    void onError(Update update, Exception onProcessException);

}
