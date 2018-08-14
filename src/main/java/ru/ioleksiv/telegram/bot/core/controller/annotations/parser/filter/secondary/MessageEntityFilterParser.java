package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MessageEntityFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class MessageEntityFilterParser extends FilterParser<MessageEntityFilter, MessageEntity> {

    @Override
    public Checker<MessageEntity> createChecker(MessageEntityFilter annotation, Finder finder) {
        UnionExtractChecker<MessageEntity> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter type = annotation.type();
        if (type.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getType()), finder.find(type));
        }
        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<MessageEntityFilter> getAnnotationClass() {
        return MessageEntityFilter.class;
    }

}

