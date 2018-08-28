package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedChannelPostReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

import java.util.Optional;

@Component
public class EditedChannelPostUnpackerParser extends UnpackerParser<EditedChannelPostReceiver, Message> {

    @Override
    public Class<EditedChannelPostReceiver> getAnnotationClass() {
        return EditedChannelPostReceiver.class;
    }

    @Override

    public UpdateUnpacker<Message> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getChannelPost()), Message.class);
    }

}



