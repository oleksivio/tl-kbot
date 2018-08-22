package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primitive;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.FloatFilter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.FloatValidator;

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
