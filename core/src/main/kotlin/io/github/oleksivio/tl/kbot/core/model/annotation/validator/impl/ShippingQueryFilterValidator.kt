package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingQuery

class ShippingQueryFilterValidator(validator: Validator<ShippingQuery>) : FilterValidator<ShippingQuery>(
    ShippingQuery::class, validator
)
