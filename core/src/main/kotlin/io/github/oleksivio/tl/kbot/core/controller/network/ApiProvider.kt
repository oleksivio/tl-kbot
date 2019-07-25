package io.github.oleksivio.tl.kbot.core.controller.network

import io.github.oleksivio.tl.kbot.core.model.ErrorResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

abstract class ApiProvider(token: String) {

    companion object {
        const val TELEGRAM_SERVER_URL = "https://api.telegram.org/bot"
    }

    val url = "$TELEGRAM_SERVER_URL$token/"

    abstract fun <RES> send(action: Action<RES>, serverErrorListener: ServerErrorListener): RES?
}

typealias ServerErrorListener = (error: ErrorResponse) -> Unit

