package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedCredentials;

public class EncryptedCredentialsFilterValidator extends FilterValidator<EncryptedCredentials> {

    public EncryptedCredentialsFilterValidator(CustomValidator<EncryptedCredentials> validator) {
        super(EncryptedCredentials.class, validator);
    }
}
