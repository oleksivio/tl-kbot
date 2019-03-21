package io.github.oleksivio.telegram.bot.core.model.method.common

import io.github.oleksivio.telegram.bot.core.model.method.Action

abstract class ChatAction<RES> : Action<RES>() {
    abstract val chatId: Long?
}
