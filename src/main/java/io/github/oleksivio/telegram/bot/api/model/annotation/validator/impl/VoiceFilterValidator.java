package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Voice;

public class VoiceFilterValidator extends FilterValidator<Voice> {

    public VoiceFilterValidator(CustomValidator<Voice> validator) {
        super(Voice.class, validator);
    }
}

