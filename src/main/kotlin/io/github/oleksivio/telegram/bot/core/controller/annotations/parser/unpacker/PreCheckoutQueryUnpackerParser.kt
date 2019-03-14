package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.PreCheckoutQueryReceiver
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class PreCheckoutQueryUnpackerParser : UnpackerParser<PreCheckoutQueryReceiver, PreCheckoutQuery>() {
    override val updateUnpacker: UpdateUnpacker<PreCheckoutQuery>
        get() = UpdateUnpacker({ it.preCheckoutQuery }, PreCheckoutQuery::class)

    override val parserAnnotationClass = PreCheckoutQueryReceiver::class

}
