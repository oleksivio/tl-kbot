package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Contact;

public class ContactFilterValidator extends FilterValidator<Contact> {

    public ContactFilterValidator(CustomValidator<Contact> validator) {
        super(Contact.class, validator);
    }
}
