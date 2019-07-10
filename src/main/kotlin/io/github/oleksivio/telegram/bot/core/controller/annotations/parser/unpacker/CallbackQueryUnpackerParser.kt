package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.CallbackQueryReceiver
import io.github.oleksivio.tl.kbot.server.api.objects.std.CallbackQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class CallbackQueryUnpackerParser : UnpackerParser<CallbackQueryReceiver, CallbackQuery>() {
    override val updateUnpacker: UpdateUnpacker<CallbackQuery>
        get() = UpdateUnpacker({ it.callbackQuery }, CallbackQuery::class)

    override val parserAnnotationClass = CallbackQueryReceiver::class

}
