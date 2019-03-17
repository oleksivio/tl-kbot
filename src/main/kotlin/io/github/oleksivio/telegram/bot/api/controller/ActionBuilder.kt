package io.github.oleksivio.telegram.bot.api.controller

import io.github.oleksivio.telegram.bot.api.model.NetworkError
import io.github.oleksivio.telegram.bot.core.model.method.Action

typealias ActionCreate<RES> = () -> Action<RES>

interface ActionBuilder {
    fun <RES> action(initBlock: ActionCreate<RES>): ActionErrorListener<RES>
    fun <RES> action(action: Action<RES>): ActionErrorListener<RES>
}

interface ActionSend<RES> {
    fun send(): RES?
}

interface ActionErrorListener<RES> {
    fun errorListener(networkError: NetworkError): ActionSend<RES>

    fun send(): RES?
}
