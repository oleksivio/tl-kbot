package io.github.oleksivio.tl.kbot.server.api.model.method.common

import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

abstract class ChatAction<RES> : Action<RES>() {
    abstract val chatId: ChatId?
}
