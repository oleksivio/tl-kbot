package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.tl.kbot.server.api.objects.Update

typealias UpdateErrorListener = (update: Update, onProcessException: Exception) -> Unit
