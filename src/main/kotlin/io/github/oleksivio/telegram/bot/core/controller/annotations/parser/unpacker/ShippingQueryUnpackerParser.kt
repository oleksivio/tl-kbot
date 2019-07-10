package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.ShippingQueryReceiver
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class ShippingQueryUnpackerParser : UnpackerParser<ShippingQueryReceiver, ShippingQuery>() {
    override val updateUnpacker: UpdateUnpacker<ShippingQuery>
        get() = UpdateUnpacker({ it.shippingQuery }, ShippingQuery::class)

    override val parserAnnotationClass = ShippingQueryReceiver::class

}
