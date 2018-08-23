package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.core.controller.annotations.holder.CustomValidatorHolder;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
public class ValidatorFinder implements Finder {

    private final Map<Class, FilterParser> annotationParserMap = new HashMap<>();
    private final CustomValidatorHolder customValidatorHolder;

    public ValidatorFinder(Collection<FilterParser> filterParsers,
                           CustomValidatorHolder customValidatorHolder) {

        for (FilterParser filterParser : filterParsers) {
            annotationParserMap.put(filterParser.getAnnotationClass(), filterParser);
        }

        this.customValidatorHolder = customValidatorHolder;

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
    public <T> Validator<T> find(String validatorName) {
        Optional<CustomValidator<T>> validatorOptional = customValidatorHolder.getByName(validatorName);

        if (!validatorOptional.isPresent()) {
            throw new RuntimeException("Can't find  CustomValidator with " + validatorName + " name");
        }

        return validatorOptional.get();
    }
}
