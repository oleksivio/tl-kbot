package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Venue;

public class VenueFilterValidator extends FilterValidator<Venue> {

    public VenueFilterValidator(CustomValidator<Venue> validator) {
        super(Venue.class, validator);
    }
}

