package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.List;
import java.util.Optional;

@Component
public class MessageEntityArrayFilterParser implements FilterParser<MessageEntityArrayFilter, List<MessageEntity>> {
    @Override
    public Validator<List<MessageEntity>> createChecker(MessageEntityArrayFilter annotation, Finder finder) {
        UnionExtractValidatorList<MessageEntity> unionExtractValidatorList = new UnionExtractValidatorList<>();

        MessageEntity.Type type = annotation.type();
        if (type.notAll()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<MessageEntityArrayFilter> getAnnotationClass() {
        return MessageEntityArrayFilter.class;
    }
}
