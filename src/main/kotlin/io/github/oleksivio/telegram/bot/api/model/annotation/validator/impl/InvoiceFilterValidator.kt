package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.Invoice
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class InvoiceFilterValidator(validator: Validator<Invoice>) : FilterValidator<Invoice>(
    Invoice::class, validator)
