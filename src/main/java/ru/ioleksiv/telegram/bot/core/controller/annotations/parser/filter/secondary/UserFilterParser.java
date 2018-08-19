package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class UserFilterParser implements FilterParser<UserFilter, User> {

    @Override
    public Checker<User> createChecker(UserFilter annotation, Finder finder) {
        UnionExtractChecker<User> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter username = annotation.username();
        if (username.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter languageCode = annotation.languageCode();
        if (languageCode.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));
        }
        BooleanFilter bot = annotation.bot();
        if (bot.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getBot()), finder.find(bot));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<UserFilter> getAnnotationClass() {
        return UserFilter.class;
    }

}

