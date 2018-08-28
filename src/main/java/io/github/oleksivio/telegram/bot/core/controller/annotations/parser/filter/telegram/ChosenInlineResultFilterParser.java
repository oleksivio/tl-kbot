package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ChosenInlineResultFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult;

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

