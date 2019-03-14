package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.telegram.bot.api.model.objects.Update

interface TelegramProcessor {

    fun receive(update: Update)

}
