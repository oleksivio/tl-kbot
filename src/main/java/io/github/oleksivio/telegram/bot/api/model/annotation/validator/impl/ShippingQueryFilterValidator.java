package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingQuery;

public class ShippingQueryFilterValidator extends FilterValidator<ShippingQuery> {

    public ShippingQueryFilterValidator(CustomValidator<ShippingQuery> validator) {
        super(ShippingQuery.class, validator);
    }
}
