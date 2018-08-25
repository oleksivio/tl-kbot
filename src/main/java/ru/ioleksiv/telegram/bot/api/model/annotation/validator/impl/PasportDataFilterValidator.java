package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportData;

public class PasportDataFilterValidator extends FilterValidator<PassportData> {

    public PasportDataFilterValidator(CustomValidator<PassportData> validator) {
        super(PassportData.class, validator);
    }
}
