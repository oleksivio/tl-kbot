package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.MessageReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message

class MessageUnpackerParser : UnpackerParser<MessageReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker(
            { it.message },
            Message::class
        )

    override val parserAnnotationClass = MessageReceiver::class
}



