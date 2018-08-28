package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.MessageEntity;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.List;
import java.util.Optional;

@Component
public class MessageEntityArrayFilterParser implements FilterParser<MessageEntityArrayFilter, List<MessageEntity>> {
    @Override
    public Validator<List<MessageEntity>> createChecker(MessageEntityArrayFilter annotation, Finder finder) {
        UnionExtractValidatorList<MessageEntity> unionExtractValidatorList = new UnionExtractValidatorList<>();

        MessageEntity.Type type = annotation.type();
        if (type.isChosen()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        IntegerFilter length = annotation.length();
        if (length.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        StringFilter url = annotation.url();
        if (url.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getUrl()), finder.find(url));
        }
        UserFilter user = annotation.user();
        if (user.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getUser()), finder.find(user));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<MessageEntityArrayFilter> getAnnotationClass() {
        return MessageEntityArrayFilter.class;
    }
}
