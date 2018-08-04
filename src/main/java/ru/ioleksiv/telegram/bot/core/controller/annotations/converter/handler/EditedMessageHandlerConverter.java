package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.EditedMessageHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.EditedMessageUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class EditedMessageHandlerConverter extends HandlerConverter<EditedMessageHandler, Message> {

    public EditedMessageHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<EditedMessageHandler> getFactoryAnnotation() {
        return EditedMessageHandler.class;
    }

    @Override
    protected Unpacker<Message> toUnpacker() {
        return new EditedMessageUnpacker();
    }

    @Override
    public Class<Message> getArgumentType() {
        return Message.class;
    }

}



