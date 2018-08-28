package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.Invoice;

public class InvoiceFilterValidator extends FilterValidator<Invoice> {

    public InvoiceFilterValidator(CustomValidator<Invoice> validator) {
        super(Invoice.class, validator);
    }
}
