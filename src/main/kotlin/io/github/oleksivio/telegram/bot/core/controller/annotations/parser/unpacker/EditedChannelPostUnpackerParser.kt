package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedChannelPostReceiver
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class EditedChannelPostUnpackerParser : UnpackerParser<EditedChannelPostReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker({ it.editedChannelPost }, Message::class)

    override val parserAnnotationClass = EditedChannelPostReceiver::class

}



