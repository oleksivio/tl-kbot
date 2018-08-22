package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.BooleanValidator;

@Component
public class BooleanFilterParser implements FilterParser<BooleanFilter, Boolean> {

    @Override
    public Validator<Boolean> createChecker(BooleanFilter annotation, Finder finder) {
        return new BooleanValidator(annotation.state());
    }

    @Override
    public Class<BooleanFilter> getAnnotationClass() {
        return BooleanFilter.class;
    }

}
