package io.github.oleksivio.telegram.bot.core.model.method.common

abstract class CaptionAction protected constructor() : FormattedMessageAction() {
    abstract val caption: String?
}
