package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedMessageReceiver
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class EditedMessageUnpackerParser : UnpackerParser<EditedMessageReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker({ it.editedMessage }, Message::class)

    override val parserAnnotationClass = EditedMessageReceiver::class

}



