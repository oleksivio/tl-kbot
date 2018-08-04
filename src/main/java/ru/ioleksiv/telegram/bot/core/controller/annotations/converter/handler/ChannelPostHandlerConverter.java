package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.ChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.ChannelPostUnpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class ChannelPostHandlerConverter extends HandlerConverter<ChannelPostHandler, Message> {

    public ChannelPostHandlerConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<ChannelPostHandler> getFactoryAnnotation() {
        return ChannelPostHandler.class;
    }

    @Override
    protected Unpacker<Message> toUnpacker() {
        return new ChannelPostUnpacker();
    }

    @Override
    public Class<Message> getArgumentType() {
        return Message.class;
    }

}



