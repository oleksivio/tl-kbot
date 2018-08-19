package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractCheckerList;

import java.util.List;
import java.util.Optional;

@Component
public class UserArrayFilterParser implements FilterParser<UserArrayFilter, List<User>> {
    @Override
    public Checker<List<User>> createChecker(UserArrayFilter annotation, Finder finder) {

        UnionExtractCheckerList<User> unionExtractCheckerList = new UnionExtractCheckerList<>();

        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter username = annotation.username();
        if (username.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter languageCode = annotation.languageCode();
        if (languageCode.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));
        }
        BooleanFilter bot = annotation.bot();
        if (bot.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getBot()), finder.find(bot));
        }

        return unionExtractCheckerList;
    }

    @Override
    public Class<UserArrayFilter> getAnnotationClass() {
        return UserArrayFilter.class;
    }
}
