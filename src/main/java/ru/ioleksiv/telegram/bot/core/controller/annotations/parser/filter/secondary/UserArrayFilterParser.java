package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionChecker;

import java.util.List;

@Component
public class UserArrayFilterParser extends FilterParser<UserArrayFilter, List<User>> {
    @Override
    public Checker<List<User>> createChecker(UserArrayFilter annotation, Finder finder) {
        UnionChecker<User> unionChecker = new UnionChecker<>();

        for (UserFilter messageEntityFilter : annotation.array()) {
            unionChecker.add(finder.find(messageEntityFilter));
        }

        return unionChecker;
    }

    @Override
    public Class<UserArrayFilter> getAnnotationClass() {
        return UserArrayFilter.class;
    }
}
