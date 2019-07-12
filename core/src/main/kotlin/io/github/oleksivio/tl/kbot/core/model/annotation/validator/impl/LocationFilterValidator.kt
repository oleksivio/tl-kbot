package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Location
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class LocationFilterValidator(validator: Validator<Location>) : FilterValidator<Location>(
    Location::class, validator)