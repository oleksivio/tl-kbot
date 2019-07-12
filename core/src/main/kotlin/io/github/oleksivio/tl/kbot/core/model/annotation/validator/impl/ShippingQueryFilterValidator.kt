package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingQuery
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class ShippingQueryFilterValidator(validator: Validator<ShippingQuery>) : FilterValidator<ShippingQuery>(
    ShippingQuery::class, validator)
