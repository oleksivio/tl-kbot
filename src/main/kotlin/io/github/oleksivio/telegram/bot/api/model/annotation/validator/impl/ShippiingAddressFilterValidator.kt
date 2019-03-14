package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingAddress

class ShippiingAddressFilterValidator(validator: CustomValidator<ShippingAddress>) : FilterValidator<ShippingAddress>(ShippingAddress::class, validator)
