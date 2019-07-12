package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.PreCheckoutQueryReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.payments.PreCheckoutQuery
 

class PreCheckoutQueryUnpackerParser : UnpackerParser<PreCheckoutQueryReceiver, PreCheckoutQuery>() {
    override val updateUnpacker: UpdateUnpacker<PreCheckoutQuery>
        get() = UpdateUnpacker(
            { it.preCheckoutQuery },
            PreCheckoutQuery::class
        )

    override val parserAnnotationClass = PreCheckoutQueryReceiver::class
}
