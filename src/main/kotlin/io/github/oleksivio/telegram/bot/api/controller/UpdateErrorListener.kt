package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.telegram.bot.api.model.objects.Update

typealias UpdateErrorListener = (update: Update, onProcessException: Exception) -> Unit
