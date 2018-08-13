package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StringFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.StringChecker;

@Component
public class StringFilterParser extends FilterParser<StringFilter, String> {

    @Override
    public Checker<String> createChecker(StringFilter annotation, Finder finder) {
        return new StringChecker(annotation.startWith(),
                                 annotation.equalWith(),
                                 annotation.endWith(),
                                 annotation.contains(),
                                 annotation.regExp());
    }

    @Override
    public Class<StringFilter> getAnnotationClass() {
        return StringFilter.class;
    }

}
