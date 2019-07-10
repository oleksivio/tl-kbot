package io.github.oleksivio.tl.kbot.server.api.model.method.file

import io.github.oleksivio.tl.kbot.server.api.model.method.common.CaptionAction
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

abstract class ThumbAction protected constructor() : CaptionAction() {
    abstract val thumb: InputFile?
}
