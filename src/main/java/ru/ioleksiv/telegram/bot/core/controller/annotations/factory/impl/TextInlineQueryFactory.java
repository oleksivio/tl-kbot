package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.impl;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.inline.TextInlineQuery;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.SimpleFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.inline.InlineQueryHandler;

import java.lang.reflect.Method;
import java.util.Optional;

@Component
public class TextInlineQueryFactory extends SimpleFactory<TextInlineQuery> {
    public TextInlineQueryFactory(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    public Class<TextInlineQuery> getFactoryAnnotation() {
        return TextInlineQuery.class;
    }

    @Override
    protected Optional<Handler> mapper(@NotNull TextInlineQuery annotationArgs,
                                       @NotNull Object classInstance,
                                       @NotNull Method method,
                                       @NotNull ActionBuilder actionBuilder) {
        Handler inlineQueryHandler = new InlineQueryHandler(actionBuilder,
                                                            classInstance,
                                                            method,
                                                            annotationArgs.query());

        return Optional.of(inlineQueryHandler);
    }
}



