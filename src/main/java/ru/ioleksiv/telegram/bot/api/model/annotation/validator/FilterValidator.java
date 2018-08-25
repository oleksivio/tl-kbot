package ru.ioleksiv.telegram.bot.api.model.annotation.validator;

import ru.ioleksiv.telegram.bot.core.model.ITelegram;

public class FilterValidator<T extends ITelegram> {
    private final Class<T> targetClass;
    private final CustomValidator<T> validator;

    protected FilterValidator(Class<T> targetClass, CustomValidator<T> validator) {
        this.targetClass = targetClass;
        this.validator = validator;
    }

    public final Class<T> getFilterTarget() {
        return targetClass;
    }

    public final CustomValidator<T> getValidator() {
        return validator;
    }
}
