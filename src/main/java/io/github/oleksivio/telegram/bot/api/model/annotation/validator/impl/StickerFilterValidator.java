package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.Sticker;

public class StickerFilterValidator extends FilterValidator<Sticker> {

    public StickerFilterValidator(CustomValidator<Sticker> validator) {
        super(Sticker.class, validator);
    }
}
