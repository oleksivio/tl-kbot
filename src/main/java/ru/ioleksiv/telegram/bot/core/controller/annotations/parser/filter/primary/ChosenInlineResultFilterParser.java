package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primary.ChosenInlineResultFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class ChosenInlineResultFilterParser extends FilterParser<ChosenInlineResultFilter, ChosenInlineResult> {

    @Override
    public Checker<ChosenInlineResult> createChecker(ChosenInlineResultFilter annotation, Finder finder) {
        UnionExtractChecker<ChosenInlineResult> unionExtractChecker = new UnionExtractChecker<>();

        UserFilter from = annotation.from();
        if (from.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        LocationFilter location = annotation.location();
        if (location.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter inlineMessageId = annotation.inlineMessageId();
        if (inlineMessageId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getInlineMessageId()), finder.find(inlineMessageId));
        }
        StringFilter query = annotation.query();
        if (query.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getQuery()), finder.find(query));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<ChosenInlineResultFilter> getAnnotationClass() {
        return ChosenInlineResultFilter.class;
    }

}

