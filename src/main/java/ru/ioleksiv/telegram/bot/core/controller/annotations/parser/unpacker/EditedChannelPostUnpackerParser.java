package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.EditedChannelPostHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class EditedChannelPostUnpackerParser extends UnpackerParser<EditedChannelPostHandler, Message> {

    @Override
    public Class<EditedChannelPostHandler> getAnnotationClass() {
        return EditedChannelPostHandler.class;
    }

    @Override

    public UpdateUnpacker<Message> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getChannelPost()), Message.class);
    }

}


