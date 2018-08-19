package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.LongFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.LongChecker;

@Component
public class LongFilterParser implements FilterParser<LongFilter, Long> {

    @Override
    public Checker<Long> createChecker(LongFilter annotation, Finder finder) {
        return new LongChecker(annotation.lessThan(),
                               annotation.lessOrEqual(),
                               annotation.moreThan(),
                               annotation.moreOrEqual());
    }

    @Override
    public Class<LongFilter> getAnnotationClass() {
        return LongFilter.class;
    }

}
