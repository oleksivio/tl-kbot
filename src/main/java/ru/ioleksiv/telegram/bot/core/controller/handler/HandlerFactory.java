package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.inline.InlineQueryHandler;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.TextMessageHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.AbstractInvokeHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.InlineQueryInvokeHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.TextInvokeHandler;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

public final class HandlerFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(HandlerFactory.class);

    private HandlerFactory() {
    }

    @Nullable
    public static AbstractInvokeHandler create(@Nullable Object classInstance, @Nullable Method method) {

        if (classInstance == null || method == null) {
            return null;
        }

        if (method.isAnnotationPresent(TextMessageHandler.class)) {
            TextMessageHandler textHandler = method.getAnnotation(TextMessageHandler.class);
            Collection<String> startWithCollection = Arrays.asList(textHandler.startWith());

            Collection<String> endWithCollection = Arrays.asList(textHandler.endWith());

            Collection<String> equalsWithCollection = Arrays.asList(textHandler.equalWith());

            String regExp = textHandler.regExp();

            return new TextInvokeHandler(classInstance,
                                                                        method,
                                                                        startWithCollection,
                                                                        equalsWithCollection,
                                                                        endWithCollection,
                                                                        regExp);
        }

        if (method.isAnnotationPresent(InlineQueryHandler.class)) {
            InlineQueryHandler queryFilter = method.getAnnotation(InlineQueryHandler.class);
            return new InlineQueryInvokeHandler(classInstance,
                                                method,
                                                queryFilter.query());

        }

        return null;
    }
}
