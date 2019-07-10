package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.api.annotations.receiver.ChannelPostReceiver
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import org.springframework.stereotype.Component

@Component
class ChannelPostUnpackerParser : UnpackerParser<ChannelPostReceiver, Message>() {
    override val updateUnpacker: UpdateUnpacker<Message>
        get() = UpdateUnpacker({ it.channelPost }, Message::class)

    override val parserAnnotationClass = ChannelPostReceiver::class

}



