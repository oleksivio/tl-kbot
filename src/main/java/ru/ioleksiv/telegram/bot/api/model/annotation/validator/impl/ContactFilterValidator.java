package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;

public class ContactFilterValidator extends FilterValidator<Contact> {

    public ContactFilterValidator(CustomValidator<Contact> validator) {
        super(Contact.class, validator);
    }
}
