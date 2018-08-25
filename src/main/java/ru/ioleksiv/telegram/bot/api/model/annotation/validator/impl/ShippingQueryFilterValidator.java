package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;

public class ShippingQueryFilterValidator extends FilterValidator<ShippingQuery> {

    public ShippingQueryFilterValidator(CustomValidator<ShippingQuery> validator) {
        super(ShippingQuery.class, validator);
    }
}
