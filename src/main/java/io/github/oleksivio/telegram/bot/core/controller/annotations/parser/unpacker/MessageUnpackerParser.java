package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.api.annotations.receiver.MessageReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MessageUnpackerParser extends UnpackerParser<MessageReceiver, Message> {

    @Override
    public Class<MessageReceiver> getAnnotationClass() {
        return MessageReceiver.class;
    }

    @Override
    public UpdateUnpacker<Message> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getMessage()), Message.class);
    }

}



