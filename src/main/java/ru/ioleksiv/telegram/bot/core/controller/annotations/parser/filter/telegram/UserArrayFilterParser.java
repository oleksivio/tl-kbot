package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserArrayFilterParser implements FilterParser<UserArrayFilter, List<User>> {
    @Override
    public Validator<List<User>> createChecker(UserArrayFilter annotation, Finder finder) {

        UnionExtractValidatorList<User> unionExtractValidatorList = new UnionExtractValidatorList<>();

        Arrays.stream(annotation.validator())
                .map(finder::find)
                .forEach(validator -> unionExtractValidatorList.add(Optional::of, validator));

        StringFilter firstName = annotation.firstName();
        if (firstName.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter username = annotation.username();
        if (username.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter languageCode = annotation.languageCode();
        if (languageCode.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));
        }
        BooleanFilter bot = annotation.bot();
        if (bot.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getBot()), finder.find(bot));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<UserArrayFilter> getAnnotationClass() {
        return UserArrayFilter.class;
    }
}
