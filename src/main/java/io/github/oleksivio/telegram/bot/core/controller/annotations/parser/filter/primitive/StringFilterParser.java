package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.StringValidator;
import org.springframework.stereotype.Component;

@Component
public class StringFilterParser implements FilterParser<StringFilter, String> {

    @Override
    public Validator<String> createChecker(StringFilter annotation, Finder finder) {
        return new StringValidator(annotation.startWith(),
                                   annotation.equalWith(),
                                   annotation.endWith(),
                                   annotation.contain(),
                                   annotation.regExp(),
                                   annotation.notStartWith(),
                                   annotation.notEndWith(),
                                   annotation.notContain()
        );
    }

    @Override
    public Class<StringFilter> getAnnotationClass() {
        return StringFilter.class;
    }

}
