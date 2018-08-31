package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Audio;

public class AudioFilterValidator extends FilterValidator<Audio> {

    public AudioFilterValidator(CustomValidator<Audio> validator) {
        super(Audio.class, validator);
    }
}

