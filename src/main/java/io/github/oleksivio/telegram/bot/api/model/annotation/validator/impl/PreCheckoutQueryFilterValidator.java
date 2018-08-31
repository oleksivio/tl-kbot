package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery;

public class PreCheckoutQueryFilterValidator extends FilterValidator<PreCheckoutQuery> {

    public PreCheckoutQueryFilterValidator(CustomValidator<PreCheckoutQuery> validator) {
        super(PreCheckoutQuery.class, validator);
    }
}

