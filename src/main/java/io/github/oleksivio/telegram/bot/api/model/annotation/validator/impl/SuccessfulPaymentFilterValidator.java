package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.SuccessfulPayment;

public class SuccessfulPaymentFilterValidator extends FilterValidator<SuccessfulPayment> {

    public SuccessfulPaymentFilterValidator(CustomValidator<SuccessfulPayment> validator) {
        super(SuccessfulPayment.class, validator);
    }
}
