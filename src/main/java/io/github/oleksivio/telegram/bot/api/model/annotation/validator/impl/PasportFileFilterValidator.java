package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportFile;

public class PasportFileFilterValidator extends FilterValidator<PassportFile> {

    public PasportFileFilterValidator(CustomValidator<PassportFile> validator) {
        super(PassportFile.class, validator);
    }
}
