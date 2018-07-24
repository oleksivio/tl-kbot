package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.inline.TextInlineQuery;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.ContactMessage;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.LocationMessage;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.TextMessage;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.inline.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.ContactHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.LocationHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.ChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.EditedChannelPostHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.EditedMessageHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.MessageHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.text.TextHandler;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

final class HandlerFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerFactory.class);

    private HandlerFactory() {
    }

    @NotNull
    static Optional<Handler> create(@NotNull Object classInstance,
                                    @NotNull Method method) {

        if (method.isAnnotationPresent(TextMessage.class)) {
            TextMessage text = method.getAnnotation(TextMessage.class);
            Collection<String> startWithCollection = Arrays.asList(text.startWith());

            Collection<String> endWithCollection = Arrays.asList(text.endWith());

            Collection<String> equalsWithCollection = Arrays.asList(text.equalWith());

            String regExp = text.regExp();

            Handler textHandler = createTextHandler(classInstance,
                                                    method,
                                                    startWithCollection,
                                                    equalsWithCollection,
                                                    endWithCollection,
                                                    regExp,
                                                    text.type());
            return Optional.of(textHandler);
        }

        if (method.isAnnotationPresent(TextInlineQuery.class)) {
            TextInlineQuery query = method.getAnnotation(TextInlineQuery.class);
            Handler inlineQueryHandler = new InlineQueryHandler(
                    classInstance,
                    method,
                    query.query());

            return Optional.of(inlineQueryHandler);
        }

        if (method.isAnnotationPresent(LocationMessage.class)) {
            Handler locationHandler = new LocationHandler(classInstance, method);

            return Optional.of(locationHandler);
        }

        if (method.isAnnotationPresent(ContactMessage.class)) {
            Handler contactHandler = new ContactHandler(classInstance, method);

            return Optional.of(contactHandler);
        }

        return Optional.empty();
    }

    private static TextHandler createTextHandler(@NotNull Object classInstance,
                                                 @NotNull Method method,
                                                 Collection<String> startWithCollection,
                                                 Collection<String> equalsWithCollection,
                                                 Collection<String> endWithCollection,
                                                 String regExp,
                                                 TextMessage.Type type) {
        switch (type) {
            case MESSAGE: {
                return new MessageHandler(classInstance,
                                          method,
                                          startWithCollection,
                                          equalsWithCollection,
                                          endWithCollection,
                                          regExp);
            }
            case EDITED_MESSAGE: {
                return new EditedMessageHandler(classInstance,
                                                method,
                                                startWithCollection,
                                                equalsWithCollection,
                                                endWithCollection,
                                                regExp);
            }
            case CHANNEL_POST: {
                return new ChannelPostHandler(classInstance,
                                              method,
                                              startWithCollection,
                                              equalsWithCollection,
                                              endWithCollection,
                                              regExp);
            }
            case EDITED_CHANNEL_POST: {
                return new EditedChannelPostHandler(classInstance,
                                                    method,
                                                    startWithCollection,
                                                    equalsWithCollection,
                                                    endWithCollection,
                                                    regExp);
            }
        }

        throw new UnsupportedOperationException("Unsupported text handler type");
    }
}
