package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Controller
public class ValidatorFinder implements Finder {

    private final Map<Class, FilterParser> annotationParserMap = new HashMap<>();
    private final Map<Class<? extends CustomValidator>, CustomValidator<?>> validatorMap = new HashMap<>();

    @Autowired(required = false)
    public ValidatorFinder(Collection<FilterParser> filterParsers,
                           Optional<Collection<CustomValidator>> customValidatorsOptional) {

        for (FilterParser filterParser : filterParsers) {
            annotationParserMap.put(filterParser.getAnnotationClass(), filterParser);
        }

        for (CustomValidator validator : customValidatorsOptional.orElse(new ArrayList<>())) {
            validatorMap.put(validator.getClass(), validator);
        }
    }

    @Override
    public <SA extends Annotation, T> Validator<T> find(SA annotation) {
        Class<? extends Annotation> keyClass = annotation.annotationType();

        if (!annotationParserMap.containsKey(keyClass)) {
            return argument -> true;
        }

        FilterParser<SA, T> secondaryFilterParser = (FilterParser<SA, T>) annotationParserMap.get(keyClass);
        return secondaryFilterParser.createChecker(annotation, this);
    }

    @Override
    public <T> Validator<T> find(Class<? extends Validator> validatorClass) {
        Validator<T> validator = (Validator<T>) validatorMap.get(validatorClass);

        if (Objects.isNull(validator)) {
            throw new RuntimeException(validatorClass.getName() + " is not Spring bean");
        }

        return validator;
    }
}
