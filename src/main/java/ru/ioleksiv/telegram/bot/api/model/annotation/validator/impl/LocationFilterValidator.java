package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;

public class LocationFilterValidator extends FilterValidator<Location> {

    public LocationFilterValidator(CustomValidator<Location> validator) {
        super(Location.class, validator);
    }
}
