package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class ShippingQueryFilterValidator(validator: Validator<ShippingQuery>) : FilterValidator<ShippingQuery>(ShippingQuery::class, validator)
