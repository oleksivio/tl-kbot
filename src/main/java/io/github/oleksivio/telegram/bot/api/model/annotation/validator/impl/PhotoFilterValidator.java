package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize;

public class PhotoFilterValidator extends FilterValidator<PhotoSize> {

    public PhotoFilterValidator(CustomValidator<PhotoSize> validator) {
        super(PhotoSize.class, validator);
    }
}

