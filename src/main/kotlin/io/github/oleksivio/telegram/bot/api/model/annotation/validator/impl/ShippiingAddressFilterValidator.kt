package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingAddress
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class ShippiingAddressFilterValidator(validator: Validator<ShippingAddress>) : FilterValidator<ShippingAddress>(
    ShippingAddress::class, validator)
