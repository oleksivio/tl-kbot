package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.VideoNote
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class VideoNoteFilterValidator(validator: Validator<VideoNote>) : FilterValidator<VideoNote>(
    VideoNote::class, validator)

