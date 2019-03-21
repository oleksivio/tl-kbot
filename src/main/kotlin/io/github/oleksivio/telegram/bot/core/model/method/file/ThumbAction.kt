package io.github.oleksivio.telegram.bot.core.model.method.file

import io.github.oleksivio.telegram.bot.core.model.method.common.CaptionAction

abstract class ThumbAction protected constructor() : CaptionAction() {
    abstract val thumb: String?
}
