package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Location;

public class LocationFilterValidator extends FilterValidator<Location> {

    public LocationFilterValidator(CustomValidator<Location> validator) {
        super(Location.class, validator);
    }
}
