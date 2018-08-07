package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.update;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.handler.EditedMessageHandler;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

@Component
public class EditedMessageHandlerConverter extends UpdateHandlerConverter<EditedMessageHandler, Message> {

    @Override
    protected Class<EditedMessageHandler> getFactoryAnnotation() {
        return EditedMessageHandler.class;
    }

    @Override
    public @Nullable Unpacker<Update, Message> getUnpacker() {
        return Update::getEditedMessage;
    }

    @NotNull
    @Override
    public Class<Message> outClass() {
        return Message.class;
    }

}



