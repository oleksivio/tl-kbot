package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.ChosenInlineResultReceiver
import io.github.oleksivio.tl.kbot.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.inline.ChosenInlineResult

class ChosenInlineResultUnpackerParser : UnpackerParser<ChosenInlineResultReceiver, ChosenInlineResult>() {
    override val updateUnpacker: UpdateUnpacker<ChosenInlineResult>
        get() = UpdateUnpacker(
            { it.chosenInlineResult },
            ChosenInlineResult::class
        )

    override val parserAnnotationClass = ChosenInlineResultReceiver::class
}
