package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.InlineQueryFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery;

import java.util.Optional;

@Component
public class InlineQueryFilterParser implements FilterParser<InlineQueryFilter, InlineQuery> {

    @Override
    public Validator<InlineQuery> createChecker(InlineQueryFilter annotation, Finder finder) {
        UnionExtractValidator<InlineQuery> unionExtractValidator = new UnionExtractValidator<>();

        UserFilter from = annotation.from();
        if (from.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        LocationFilter location = annotation.location();
        if (location.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter query = annotation.query();
        if (query.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getQuery()), finder.find(query));
        }
        StringFilter offset = annotation.offset();
        if (offset.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getOffset()), finder.find(offset));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<InlineQueryFilter> getAnnotationClass() {
        return InlineQueryFilter.class;
    }

}

