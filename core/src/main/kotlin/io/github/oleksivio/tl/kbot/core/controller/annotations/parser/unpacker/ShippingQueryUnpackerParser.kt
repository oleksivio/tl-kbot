package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.ShippingQueryReceiver
import io.github.oleksivio.tl.kbot.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingQuery

class ShippingQueryUnpackerParser : UnpackerParser<ShippingQueryReceiver, ShippingQuery>() {
    override val updateUnpacker: UpdateUnpacker<ShippingQuery>
        get() = UpdateUnpacker(
            { it.shippingQuery },
            ShippingQuery::class
        )

    override val parserAnnotationClass = ShippingQueryReceiver::class
}
