package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.ChannelPostHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class ChannelPostHandlerConverter extends UpdateHandlerConverter<ChannelPostHandler, Message> {

    @Override
    protected Class<ChannelPostHandler> getFactoryAnnotation() {
        return ChannelPostHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, Message> getUnpacker() {
        return Update::getChannelPost;
    }

    @Override
    @NotNull
    protected Class<Message> outClass() {
        return Message.class;
    }

}



