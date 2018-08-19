package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.IntegerChecker;

@Component
public class IntegerFilterParser implements FilterParser<IntegerFilter, Integer> {

    @Override
    public Checker<Integer> createChecker(IntegerFilter annotation, Finder finder) {
        return new IntegerChecker(annotation.lessThan(),
                                  annotation.lessOrEqual(),
                                  annotation.moreThan(),
                                  annotation.moreOrEqual());
    }

    @Override
    public Class<IntegerFilter> getAnnotationClass() {
        return IntegerFilter.class;
    }

}
