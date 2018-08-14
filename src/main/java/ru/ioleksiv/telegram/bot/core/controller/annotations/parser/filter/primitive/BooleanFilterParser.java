package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.BooleanChecker;

@Component
public class BooleanFilterParser extends FilterParser<BooleanFilter, Boolean> {

    @Override
    public Checker<Boolean> createChecker(BooleanFilter annotation, Finder finder) {
        return new BooleanChecker(annotation.state());
    }

    @Override
    public Class<BooleanFilter> getAnnotationClass() {
        return BooleanFilter.class;
    }

}
