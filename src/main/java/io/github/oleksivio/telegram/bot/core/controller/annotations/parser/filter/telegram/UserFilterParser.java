package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.User;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class UserFilterParser implements FilterParser<UserFilter, User> {

    @Override
    public Validator<User> createChecker(UserFilter annotation, Finder finder) {
        UnionExtractValidator<User> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, User.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter firstName = annotation.firstName();
        if (firstName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter username = annotation.username();
        if (username.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter languageCode = annotation.languageCode();
        if (languageCode.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));
        }
        BooleanFilter bot = annotation.bot();
        if (bot.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getBot()), finder.find(bot));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<UserFilter> getAnnotationClass() {
        return UserFilter.class;
    }

}

