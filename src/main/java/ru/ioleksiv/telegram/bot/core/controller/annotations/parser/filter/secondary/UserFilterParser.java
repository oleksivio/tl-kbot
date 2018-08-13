package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.UnionChecker;

import java.util.Optional;

@Component
public class UserFilterParser extends FilterParser<UserFilter, User> {

    @Override
    public Checker<User> createChecker(UserFilter annotation, Finder finder) {
        UnionChecker<User> unionChecker = new UnionChecker<>();

        StringFilter firstName = annotation.firstName();
        if(firstName.value().isActive()) {
            unionChecker.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));}
        StringFilter lastName = annotation.lastName();
        if(lastName.value().isActive()) {
            unionChecker.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));}
        StringFilter username = annotation.username();
        if(username.value().isActive()) {
            unionChecker.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));}
        StringFilter languageCode = annotation.languageCode();
        if(languageCode.value().isActive()) {
            unionChecker.add(in -> Optional.ofNullable(in.getLanguageCode()), finder.find(languageCode));}
        BooleanFilter isBot = annotation.isBot();
        if(isBot.value().isActive()) {
            unionChecker.add(in -> Optional.ofNullable(in.getIsBot()), finder.find(isBot));}

        return unionChecker;
    }


    @Override
    public Class<UserFilter> getAnnotationClass() {
        return UserFilter.class;
    }

}

