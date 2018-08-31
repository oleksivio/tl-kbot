package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.MaskPosition;

public class MaskPositionFilterValidator extends FilterValidator<MaskPosition> {

    public MaskPositionFilterValidator(CustomValidator<MaskPosition> validator) {
        super(MaskPosition.class, validator);
    }
}
