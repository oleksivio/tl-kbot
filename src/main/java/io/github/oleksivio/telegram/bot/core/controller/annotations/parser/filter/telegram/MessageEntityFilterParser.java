package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.MessageEntity;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageEntityFilter;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;

import java.util.Optional;

@Component
public class MessageEntityFilterParser implements FilterParser<MessageEntityFilter, MessageEntity> {

    @Override
    public Validator<MessageEntity> createChecker(MessageEntityFilter annotation, Finder finder) {
        UnionExtractValidator<MessageEntity> unionExtractValidator = new UnionExtractValidator<>();

        MessageEntity.Type type = annotation.type();
        if (type.isChosen()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        IntegerFilter length = annotation.length();
        if (length.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<MessageEntityFilter> getAnnotationClass() {
        return MessageEntityFilter.class;
    }

}

