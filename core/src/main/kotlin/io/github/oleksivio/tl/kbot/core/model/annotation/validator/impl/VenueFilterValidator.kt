package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Venue
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class VenueFilterValidator(validator: Validator<Venue>) : FilterValidator<Venue>(
    Venue::class, validator)

