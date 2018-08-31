package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Video;

public class VideoFilterValidator extends FilterValidator<Video> {

    public VideoFilterValidator(CustomValidator<Video> validator) {
        super(Video.class, validator);
    }
}

