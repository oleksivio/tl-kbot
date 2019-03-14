package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class ChosenInlineResultUnpackerParser : UnpackerParser<ChosenInlineResultReceiver, ChosenInlineResult>() {
    override val updateUnpacker: UpdateUnpacker<ChosenInlineResult>
        get() = UpdateUnpacker({ it.chosenInlineResult }, ChosenInlineResult::class)

    override val parserAnnotationClass = ChosenInlineResultReceiver::class

}
