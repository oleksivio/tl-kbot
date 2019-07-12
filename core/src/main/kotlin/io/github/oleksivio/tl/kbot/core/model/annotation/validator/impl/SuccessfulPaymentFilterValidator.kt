package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.SuccessfulPayment
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class SuccessfulPaymentFilterValidator(validator: Validator<SuccessfulPayment>) : FilterValidator<SuccessfulPayment>(
    SuccessfulPayment::class, validator)
