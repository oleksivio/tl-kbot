package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingAddress

class ShippiingAddressFilterValidator(validator: Validator<ShippingAddress>) : FilterValidator<ShippingAddress>(
    ShippingAddress::class, validator
)
