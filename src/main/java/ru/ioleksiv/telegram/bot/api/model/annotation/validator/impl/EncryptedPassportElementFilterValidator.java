package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedPassportElement;

public class EncryptedPassportElementFilterValidator extends FilterValidator<EncryptedPassportElement> {

    public EncryptedPassportElementFilterValidator(CustomValidator<EncryptedPassportElement> validator) {
        super(EncryptedPassportElement.class, validator);
    }
}
