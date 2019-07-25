package io.github.oleksivio.tl.kbot.server.api.model.method.common

abstract class CaptionAction protected constructor() : FormattedMessageAction() {
    abstract val caption: String?
}
