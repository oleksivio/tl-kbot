package io.github.oleksivio.telegram.bot.core.model.method.common

import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup

abstract class EditAction<RES> protected constructor() : ChatAction<RES>() {
    abstract val inlineKeyboardMarkup: InlineKeyboardMarkup?
    abstract val messageId: Long?
    abstract val inlineMessageId: String?
}
