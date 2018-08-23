package ru.ioleksiv.telegram.bot.core.controller.annotations.holder;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CustomValidatorHolder {

    private final Map<String, CustomValidator> customValidatorMap = new HashMap<>();

    public void add(String beanName, CustomValidator customValidator) {
        customValidatorMap.put(beanName, customValidator);
    }

    public <T> Optional<CustomValidator<T>> getByName(String name) {
        return Optional.ofNullable((CustomValidator<T>) customValidatorMap.get(name));
    }
}
