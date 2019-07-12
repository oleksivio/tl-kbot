package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.CallbackQueryReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.std.CallbackQuery

class CallbackQueryUnpackerParser : UnpackerParser<CallbackQueryReceiver, CallbackQuery>() {
    override val updateUnpacker: UpdateUnpacker<CallbackQuery>
        get() = UpdateUnpacker(
            { it.callbackQuery },
            CallbackQuery::class
        )

    override val parserAnnotationClass = CallbackQueryReceiver::class
}
