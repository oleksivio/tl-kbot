package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.MessageHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class MessageUnpackerParser extends UnpackerParser<MessageHandler, Message> {

    @Override
    public Class<MessageHandler> getAnnotationClass() {
        return MessageHandler.class;
    }

    @Override
    public UpdateUnpacker<Message> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getMessage()), Message.class);
    }

}



