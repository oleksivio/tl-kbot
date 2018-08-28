package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.FloatFilter;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.FloatValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

@Component
public class FloatFilterParser implements FilterParser<FloatFilter, Float> {

    @Override
    public Validator<Float> createChecker(FloatFilter annotation, Finder finder) {
        return new FloatValidator(annotation.lessThan(),
                                  annotation.lessOrEqual(),
                                  annotation.moreThan(),
                                  annotation.moreOrEqual(),
                                  annotation.equal());
    }

    @Override
    public Class<FloatFilter> getAnnotationClass() {
        return FloatFilter.class;
    }

}
