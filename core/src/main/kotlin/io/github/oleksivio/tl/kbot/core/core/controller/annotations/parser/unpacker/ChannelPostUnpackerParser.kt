package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.unpacker

import io.github.oleksivio.tl.kbot.core.annotations.receiver.ChannelPostReceiver
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message

class ChannelPostUnpackerParser : UnpackerParser<ChannelPostReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker(
            { it.channelPost },
            Message::class
        )

    override val parserAnnotationClass = ChannelPostReceiver::class
}



