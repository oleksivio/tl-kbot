package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.impl;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.TextMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.SimpleFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.ChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.EditedChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.EditedMessageHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.MessageHandler;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@Component
public final class TextMessageFactory extends SimpleFactory<TextMessage> {

    public TextMessageFactory(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    public Class<TextMessage> getFactoryAnnotation() {
        return TextMessage.class;
    }

    @Override
    protected Optional<Handler> mapper(@NotNull TextMessage annotationArgs,
                                       @NotNull Object classInstance,
                                       @NotNull Method method,
                                       @NotNull ActionBuilder actionBuilder) {
        Collection<String> startWithCollection = Arrays.asList(annotationArgs.startWith());

        Collection<String> endWithCollection = Arrays.asList(annotationArgs.endWith());

        Collection<String> equalsWithCollection = Arrays.asList(annotationArgs.equalWith());

        String regExp = annotationArgs.regExp();

        switch (annotationArgs.type()) {
            case MESSAGE: {
                return Optional.of(new MessageHandler(actionBuilder,
                                                      classInstance,
                                                      method,
                                                      startWithCollection,
                                                      equalsWithCollection,
                                                      endWithCollection,
                                                      regExp));
            }
            case EDITED_MESSAGE: {
                return Optional.of(new EditedMessageHandler(actionBuilder,
                                                            classInstance,
                                                            method,
                                                            startWithCollection,
                                                            equalsWithCollection,
                                                            endWithCollection,
                                                            regExp));
            }
            case CHANNEL_POST: {
                return Optional.of(new ChannelPostHandler(actionBuilder,
                                                          classInstance,
                                                          method,
                                                          startWithCollection,
                                                          equalsWithCollection,
                                                          endWithCollection,
                                                          regExp));
            }
            case EDITED_CHANNEL_POST: {
                return Optional.of(new EditedChannelPostHandler(actionBuilder,
                                                                classInstance,
                                                                method,
                                                                startWithCollection,
                                                                equalsWithCollection,
                                                                endWithCollection,
                                                                regExp));
            }
        }

        return Optional.empty();
    }

}
