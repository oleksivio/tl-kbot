package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.EditedMessageHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class EditedMessageUnpackerParser extends UnpackerParser<EditedMessageHandler, Message> {

    @Override
    public Class<EditedMessageHandler> getAnnotationClass() {
        return EditedMessageHandler.class;
    }

    @Override
    public UpdateUnpacker<Message> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getEditedMessage()), Message.class);
    }

}



