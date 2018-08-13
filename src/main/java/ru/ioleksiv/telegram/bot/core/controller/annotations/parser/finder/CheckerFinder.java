package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.NotNullChecker;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CheckerFinder implements Finder {

    private final Map<Class, FilterParser> parserMap = new HashMap<>();

    public CheckerFinder(Collection<FilterParser> filterParsers) {
        for (FilterParser filterParser : filterParsers) {
            parserMap.put(filterParser.getAnnotationClass(), filterParser);
        }
    }

    @Override
    public <SA extends Annotation, T> Checker<T> find(SA annotation) {
        Class<? extends Annotation> keyClass = annotation.annotationType();

        if (!parserMap.containsKey(keyClass)) {
            return new NotNullChecker<>();
        }

        FilterParser<SA, T> secondaryFilterParser = (FilterParser<SA, T>) parserMap.get(keyClass);
        return secondaryFilterParser.createChecker(annotation, this);
    }
}
