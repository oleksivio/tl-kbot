package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.message.TextMessage;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.TextChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.util.Arrays;

@Component
public final class TextMessageFilter extends MessageFilterConverter<TextMessage, String> {

    @Override
    public Class<TextMessage> getFactoryAnnotation() {
        return TextMessage.class;
    }

    @Override
    protected @NotNull Checker<String> createChecker(TextMessage annotation) {
        return new TextChecker(Arrays.asList(annotation.startWith()),
                               Arrays.asList(annotation.equalWith()),
                               Arrays.asList(annotation.endWith()),
                               annotation.regExp());
    }

    @Override
    public Unpacker<Message, String> getUnpacker() {
        return Message::getText;
    }

    @Override
    protected @NotNull Class<String> outClass() {
        return String.class;
    }

}
