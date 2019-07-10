package io.github.oleksivio.tl.kbot.server.api.model.method.common

abstract class FormattedMessageAction : MessageAction() {
    abstract val parseMode: String?
}
