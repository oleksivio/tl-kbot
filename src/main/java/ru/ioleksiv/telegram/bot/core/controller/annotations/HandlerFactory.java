package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.inline.TextInlineQuery;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.LocationMessage;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.TextMessage;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.inline.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.LocationHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.TextHandler;

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

            Handler textHandler = new TextHandler(classInstance,
                                                  method,
                                                  startWithCollection,
                                                  equalsWithCollection,
                                                  endWithCollection,
                                                  regExp);
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

        return Optional.empty();
    }
}
