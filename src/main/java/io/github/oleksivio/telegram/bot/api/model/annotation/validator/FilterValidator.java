package io.github.oleksivio.telegram.bot.api.model.annotation.validator;

import io.github.oleksivio.telegram.bot.core.model.ITelegram;

public abstract class FilterValidator<T extends ITelegram>  {
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
