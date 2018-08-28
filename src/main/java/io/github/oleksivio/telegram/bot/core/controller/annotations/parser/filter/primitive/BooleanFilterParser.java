package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.BooleanValidator;

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
