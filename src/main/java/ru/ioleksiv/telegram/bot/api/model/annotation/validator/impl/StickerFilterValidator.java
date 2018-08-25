package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.Sticker;

public class StickerFilterValidator extends FilterValidator<Sticker> {

    public StickerFilterValidator(CustomValidator<Sticker> validator) {
        super(Sticker.class, validator);
    }
}
