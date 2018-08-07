package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.EditedChannelPostHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class EditedChannelPostHandlerConverter extends UpdateHandlerConverter<EditedChannelPostHandler, Message> {

    @Override
    protected Class<EditedChannelPostHandler> getFactoryAnnotation() {
        return EditedChannelPostHandler.class;
    }

    @Override
    @Nullable
    public Unpacker<Update, Message> getUnpacker() {
        return Update::getEditedChannelPost;
    }

    @NotNull
    @Override
    public Class<Message> outClass() {
        return Message.class;
    }

}



