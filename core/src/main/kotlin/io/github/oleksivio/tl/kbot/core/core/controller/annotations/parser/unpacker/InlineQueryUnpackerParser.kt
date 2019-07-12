package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.InlineQueryReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.inline.InlineQuery
 

class InlineQueryUnpackerParser : UnpackerParser<InlineQueryReceiver, InlineQuery>() {
    override val updateUnpacker: UpdateUnpacker<InlineQuery>
        get() = UpdateUnpacker(
            { it.inlineQuery },
            InlineQuery::class
        )

    override val parserAnnotationClass = InlineQueryReceiver::class
}
