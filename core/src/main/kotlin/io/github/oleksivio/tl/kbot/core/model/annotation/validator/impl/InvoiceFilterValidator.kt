package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.Invoice
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class InvoiceFilterValidator(validator: Validator<Invoice>) : FilterValidator<Invoice>(
    Invoice::class, validator)
