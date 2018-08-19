package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.DoubleChecker;

@Component
public class DoubleFilterParser implements FilterParser<DoubleFilter, Double> {

    @Override
    public Checker<Double> createChecker(DoubleFilter annotation, Finder finder) {
        return new DoubleChecker(annotation.lessThan(),
                                 annotation.lessOrEqual(),
                                 annotation.moreThan(),
                                 annotation.moreOrEqual(),
                                 annotation.equal());
    }

    @Override
    public Class<DoubleFilter> getAnnotationClass() {
        return DoubleFilter.class;
    }

}
