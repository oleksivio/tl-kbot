package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.SuccessfulPayment
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class SuccessfulPaymentFilterValidator(validator: Validator<SuccessfulPayment>) : FilterValidator<SuccessfulPayment>(
    SuccessfulPayment::class, validator)
