package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.EditedMessageReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message

class EditedMessageUnpackerParser : UnpackerParser<EditedMessageReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker(
            { it.editedMessage },
            Message::class
        )

    override val parserAnnotationClass = EditedMessageReceiver::class
}



