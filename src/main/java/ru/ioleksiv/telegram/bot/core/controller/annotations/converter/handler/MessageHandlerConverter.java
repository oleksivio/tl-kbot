package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.MessageHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.MessageUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class MessageHandlerConverter extends HandlerConverter<MessageHandler, Message> {

    public MessageHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<MessageHandler> getFactoryAnnotation() {
        return MessageHandler.class;
    }

    @Override
    protected Unpacker<Message> toUnpacker() {
        return new MessageUnpacker();
    }

    @Override
    public Class<Message> getArgumentType() {
        return Message.class;
    }

}



