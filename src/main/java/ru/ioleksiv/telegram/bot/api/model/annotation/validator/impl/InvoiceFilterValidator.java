package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.Invoice;

public class InvoiceFilterValidator extends FilterValidator<Invoice> {

    public InvoiceFilterValidator(CustomValidator<Invoice> validator) {
        super(Invoice.class, validator);
    }
}
