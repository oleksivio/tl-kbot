package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedPassportElement;

public class EncryptedPassportElementFilterValidator extends FilterValidator<EncryptedPassportElement> {

    public EncryptedPassportElementFilterValidator(CustomValidator<EncryptedPassportElement> validator) {
        super(EncryptedPassportElement.class, validator);
    }
}
