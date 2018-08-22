package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Objects;
import java.util.Optional;

@Component
public class UserFilterParser implements FilterParser<UserFilter, User> {

    @Override
    public Validator<User> createChecker(UserFilter annotation, Finder finder) {
        UnionExtractValidator<User> unionExtractValidator = new UnionExtractValidator<>();

        Class<? extends Validator>[] validators = annotation.validator();
        for(Class<? extends Validator> validator : validators) {
            if (!Objects.equals(validator, StubCustomValidator.class)) {
                unionExtractValidator.add(Optional::of, finder.find(validator));
            }
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter username = annotation.username();
        if (username.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter languageCode = annotation.languageCode();
        if (languageCode.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));
        }
        BooleanFilter bot = annotation.bot();
        if (bot.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getBot()), finder.find(bot));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<UserFilter> getAnnotationClass() {
        return UserFilter.class;
    }

}

