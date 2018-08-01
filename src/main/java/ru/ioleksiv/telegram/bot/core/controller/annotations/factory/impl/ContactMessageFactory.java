package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.impl;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.ContactMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.SimpleFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.ContactHandler;

import java.lang.reflect.Method;
import java.util.Optional;

@Component
public class ContactMessageFactory extends SimpleFactory<ContactMessage> {

    public ContactMessageFactory(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    public Class<ContactMessage> getFactoryAnnotation() {
        return ContactMessage.class;
    }

    @Override
    protected Optional<Handler> mapper(@NotNull ContactMessage annotationArgs,
                                       @NotNull Object classInstance,
                                       @NotNull Method method,
                                       @NotNull ActionBuilder actionBuilder) {
        Handler contactHandler = new ContactHandler(actionBuilder, classInstance, method);
        return Optional.of(contactHandler);
    }
}



