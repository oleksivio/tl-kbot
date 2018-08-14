package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primary.InlineQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class InlineQueryFilterParser extends FilterParser<InlineQueryFilter, InlineQuery> {

    @Override
    public Checker<InlineQuery> createChecker(InlineQueryFilter annotation, Finder finder) {
        UnionExtractChecker<InlineQuery> unionExtractChecker = new UnionExtractChecker<>();

        UserFilter from = annotation.from();
        if (from.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        LocationFilter location = annotation.location();
        if (location.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter query = annotation.query();
        if (query.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getQuery()), finder.find(query));
        }
        StringFilter offset = annotation.offset();
        if (offset.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getOffset()), finder.find(offset));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<InlineQueryFilter> getAnnotationClass() {
        return InlineQueryFilter.class;
    }

}

