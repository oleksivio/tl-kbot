package io.github.oleksivio.telegram.bot.core.controller.annotations.holder;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class CustomValidatorHolder {

    private final Map<String, FilterValidator> filterValidatorMap = new HashMap<>();

    public void add(String beanName, FilterValidator filterValidator) {
        filterValidatorMap.put(beanName, filterValidator);
    }

    public <T extends ITelegram> CustomValidator<T> get(String name, Class<T> targetClass) {
        FilterValidator filterValidator = filterValidatorMap.get(name);
        if (filterValidator == null) {
            throw new RuntimeException("Can't find Filter Validator with '" + name + '\'');
        }

        Class foundClass = filterValidator.getFilterTarget();
        if (!Objects.equals(foundClass, targetClass)) {
            throw new RuntimeException("Filter Validator with '" + name + "' have invalid validation type. " +
                                               "Expected validation type is '"
                                               + targetClass.getSimpleName() + ".class' found  '"
                                               + foundClass.getSimpleName() + ".class' ");
        }

        return ((FilterValidator<T>) filterValidator).getValidator();

    }

}
