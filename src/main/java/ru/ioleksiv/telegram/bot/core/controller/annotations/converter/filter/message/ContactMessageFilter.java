package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.message.ContactMessage;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.util.Objects;

@Component
public class ContactMessageFilter extends MessageFilterConverter<ContactMessage, Contact> {

    @Override
    public Class<ContactMessage> getFactoryAnnotation() {
        return ContactMessage.class;
    }

    @Override
    @NotNull
    protected Checker<Contact> createChecker(ContactMessage annotation) {
        return Objects::nonNull;
    }

    @Override
    @Nullable
    public Unpacker<Message, Contact> getUnpacker() {
        return Message::getContact;
    }

    @Override
    @NotNull
    protected Class<Contact> outClass() {
        return Contact.class;
    }

}



