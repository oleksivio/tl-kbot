package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.telegram.bot.api.model.objects.Update

interface UpdateErrorListener {

    fun onError(update: Update, onProcessException: Exception)

}
