package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageEntityFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class MessageEntityFilterParser implements FilterParser<MessageEntityFilter, MessageEntity> {

    @Override
    public Validator<MessageEntity> createChecker(MessageEntityFilter annotation, Finder finder) {
        UnionExtractValidator<MessageEntity> unionExtractValidator = new UnionExtractValidator<>();

        MessageEntity.Type type = annotation.type();
        if (type.notAll()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<MessageEntityFilter> getAnnotationClass() {
        return MessageEntityFilter.class;
    }

}

