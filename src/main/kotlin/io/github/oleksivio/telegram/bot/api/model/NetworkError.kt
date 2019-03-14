package io.github.oleksivio.telegram.bot.api.model

interface NetworkError {
    fun onServerError(error: ErrorResponse)
}
