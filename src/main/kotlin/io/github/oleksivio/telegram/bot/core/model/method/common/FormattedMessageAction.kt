package io.github.oleksivio.telegram.bot.core.model.method.common

abstract class FormattedMessageAction : MessageAction() {
    abstract val parseMode: String?
}
