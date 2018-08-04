package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.EditedChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.EditedChannelPostUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class EditedChannelPostHandlerConverter extends HandlerConverter<EditedChannelPostHandler, Message> {

    public EditedChannelPostHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<EditedChannelPostHandler> getFactoryAnnotation() {
        return EditedChannelPostHandler.class;
    }

    @Override
    protected Unpacker<Message> toUnpacker() {
        return new EditedChannelPostUnpacker();
    }

    @Override
    public Class<Message> getArgumentType() {
        return Message.class;
    }

}



