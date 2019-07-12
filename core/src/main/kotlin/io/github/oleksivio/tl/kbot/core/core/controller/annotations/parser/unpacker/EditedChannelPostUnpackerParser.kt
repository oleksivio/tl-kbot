package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.EditedChannelPostReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
 

class EditedChannelPostUnpackerParser : UnpackerParser<EditedChannelPostReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker(
            { it.editedChannelPost },
            Message::class
        )

    override val parserAnnotationClass = EditedChannelPostReceiver::class
}



