package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingAddress;

public class ShippiingAddressFilterValidator extends FilterValidator<ShippingAddress> {

    public ShippiingAddressFilterValidator(CustomValidator<ShippingAddress> validator) {
        super(ShippingAddress.class, validator);
    }
}
