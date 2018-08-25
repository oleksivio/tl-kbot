package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;

public class MaskPositionFilterValidator extends FilterValidator<MaskPosition> {

    public MaskPositionFilterValidator(CustomValidator<MaskPosition> validator) {
        super(MaskPosition.class, validator);
    }
}
