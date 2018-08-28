package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.LongFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.LongValidator;
import org.springframework.stereotype.Component;

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
