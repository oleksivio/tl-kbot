package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.LongFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.LongValidator;

@Component
public class LongFilterParser implements FilterParser<LongFilter, Long> {

    @Override
    public Validator<Long> createChecker(LongFilter annotation, Finder finder) {
        return new LongValidator(annotation.lessThan(),
                                 annotation.lessOrEqual(),
                                 annotation.moreThan(),
                                 annotation.moreOrEqual());
    }

    @Override
    public Class<LongFilter> getAnnotationClass() {
        return LongFilter.class;
    }

}
