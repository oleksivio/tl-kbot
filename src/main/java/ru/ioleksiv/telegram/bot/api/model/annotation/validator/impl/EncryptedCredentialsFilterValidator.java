package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedCredentials;

public class EncryptedCredentialsFilterValidator extends FilterValidator<EncryptedCredentials> {

    public EncryptedCredentialsFilterValidator(CustomValidator<EncryptedCredentials> validator) {
        super(EncryptedCredentials.class, validator);
    }
}
