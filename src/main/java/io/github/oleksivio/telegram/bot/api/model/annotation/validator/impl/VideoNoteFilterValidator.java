package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.VideoNote;

public class VideoNoteFilterValidator extends FilterValidator<VideoNote> {

    public VideoNoteFilterValidator(CustomValidator<VideoNote> validator) {
        super(VideoNote.class, validator);
    }
}

