package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ChosenInlineResultFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class ChosenInlineResultFilterParser implements FilterParser<ChosenInlineResultFilter, ChosenInlineResult> {

    @Override
    public Validator<ChosenInlineResult> createChecker(ChosenInlineResultFilter annotation, Finder finder) {
        UnionExtractValidator<ChosenInlineResult> unionExtractValidator = new UnionExtractValidator<>();

        UserFilter from = annotation.from();
        if (from.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        LocationFilter location = annotation.location();
        if (location.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter inlineMessageId = annotation.inlineMessageId();
        if (inlineMessageId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getInlineMessageId()), finder.find(inlineMessageId));
        }
        StringFilter query = annotation.query();
        if (query.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getQuery()), finder.find(query));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ChosenInlineResultFilter> getAnnotationClass() {
        return ChosenInlineResultFilter.class;
    }

}

