package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.Venue
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class VenueFilterValidator(validator: Validator<Venue>) : FilterValidator<Venue>(Venue::class, validator)

