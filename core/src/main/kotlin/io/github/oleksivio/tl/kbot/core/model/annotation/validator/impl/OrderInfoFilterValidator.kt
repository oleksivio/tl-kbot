package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.OrderInfo
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class OrderInfoFilterValidator(validator: Validator<OrderInfo>) : FilterValidator<OrderInfo>(
    OrderInfo::class, validator)
