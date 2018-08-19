package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MessageEntityArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.StringTypeChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractCheckerList;

import java.util.List;
import java.util.Optional;

@Component
public class MessageEntityArrayFilterParser implements FilterParser<MessageEntityArrayFilter, List<MessageEntity>> {
    @Override
    public Checker<List<MessageEntity>> createChecker(MessageEntityArrayFilter annotation, Finder finder) {
        UnionExtractCheckerList<MessageEntity> unionExtractCheckerList = new UnionExtractCheckerList<>();

        MessageEntity.Type type = annotation.type();
        if (type.isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getType()), new StringTypeChecker(type.toString()));
        }
        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractCheckerList;
    }

    @Override
    public Class<MessageEntityArrayFilter> getAnnotationClass() {
        return MessageEntityArrayFilter.class;
    }
}
