package io.github.oleksivio.tl.kbot.server.api.model.method.common

import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.InlineKeyboardMarkup

abstract class EditAction<RES> protected constructor() : ChatAction<RES>() {
    abstract val inlineKeyboardMarkup: InlineKeyboardMarkup?
    abstract val messageId: Long?
    abstract val inlineMessageId: String?
}
