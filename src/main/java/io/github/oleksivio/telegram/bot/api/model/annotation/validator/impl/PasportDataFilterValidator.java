package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportData;

public class PasportDataFilterValidator extends FilterValidator<PassportData> {

    public PasportDataFilterValidator(CustomValidator<PassportData> validator) {
        super(PassportData.class, validator);
    }
}
