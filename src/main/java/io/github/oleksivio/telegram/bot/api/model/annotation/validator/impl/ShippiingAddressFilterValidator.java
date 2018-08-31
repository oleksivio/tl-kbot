package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingAddress;

public class ShippiingAddressFilterValidator extends FilterValidator<ShippingAddress> {

    public ShippiingAddressFilterValidator(CustomValidator<ShippingAddress> validator) {
        super(ShippingAddress.class, validator);
    }
}
