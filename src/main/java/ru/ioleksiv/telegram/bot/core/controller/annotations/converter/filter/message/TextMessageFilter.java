package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.filter.message.TextMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.MessageTextFilter;

import java.util.Arrays;

@Component
public final class TextMessageFilter extends FilterConverter<TextMessage, Message> {

    public TextMessageFilter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    public Filter<Message> toChecker(@NotNull TextMessage annotationArgs) {
        return new MessageTextFilter(Arrays.asList(annotationArgs.startWith()),
                                     Arrays.asList(annotationArgs.equalWith()),
                                     Arrays.asList(annotationArgs.endWith()),
                                     annotationArgs.regExp());
    }

    @Override
    public Class<TextMessage> getFactoryAnnotation() {
        return TextMessage.class;
    }

    @Override
    public Class<Message> getFilterInputClass() {
        return Message.class;
    }

}
