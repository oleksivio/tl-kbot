package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.DoubleValidator;
import org.springframework.stereotype.Component;

@Component
public class DoubleFilterParser implements FilterParser<DoubleFilter, Double> {

    @Override
    public Validator<Double> createChecker(DoubleFilter annotation, Finder finder) {
        return new DoubleValidator(annotation.lessThan(),
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
