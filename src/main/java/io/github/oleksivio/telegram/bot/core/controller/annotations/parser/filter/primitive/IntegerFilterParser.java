package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.IntegerValidator;

@Component
public class IntegerFilterParser implements FilterParser<IntegerFilter, Integer> {

    @Override
    public Validator<Integer> createChecker(IntegerFilter annotation, Finder finder) {
        return new IntegerValidator(annotation.lessThan(),
                                    annotation.lessOrEqual(),
                                    annotation.moreThan(),
                                    annotation.moreOrEqual());
    }

    @Override
    public Class<IntegerFilter> getAnnotationClass() {
        return IntegerFilter.class;
    }

}
