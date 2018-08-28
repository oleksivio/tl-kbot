package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.producer;

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;
import org.springframework.stereotype.Controller;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ArgCheckerProducer {
    private final Collection<FilterParser> filterParsers;
    private final Finder finder;

    public ArgCheckerProducer(Collection<FilterParser> filterParsers, Finder finder) {
        this.filterParsers = filterParsers;
        this.finder = finder;
    }

    public <A extends Annotation, T extends ITelegram> Optional<Validator<T>> create(Method method) {

        for (FilterParser<A, T> filterParser : filterParsers) {
            if (method.isAnnotationPresent(filterParser.getAnnotationClass())) {
                A annotation = method.getAnnotation(filterParser.getAnnotationClass());
                Validator<T> validator = filterParser.createChecker(annotation, finder);
                return Optional.of(validator);
            }

        }

        return Optional.empty();
    }

}
