package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.SuccessfulPayment;

public class SuccessfulPaymentFilterValidator extends FilterValidator<SuccessfulPayment> {

    public SuccessfulPaymentFilterValidator(CustomValidator<SuccessfulPayment> validator) {
        super(SuccessfulPayment.class, validator);
    }
}
