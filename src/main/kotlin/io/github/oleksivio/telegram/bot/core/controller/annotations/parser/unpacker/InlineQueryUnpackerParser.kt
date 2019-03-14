package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.InlineQueryReceiver
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class InlineQueryUnpackerParser : UnpackerParser<InlineQueryReceiver, InlineQuery>() {
    override val updateUnpacker: UpdateUnpacker<InlineQuery>
        get() = UpdateUnpacker({ it.inlineQuery }, InlineQuery::class)

    override val parserAnnotationClass = InlineQueryReceiver::class

}
