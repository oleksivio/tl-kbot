package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.VideoNote
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class VideoNoteFilterValidator(validator: Validator<VideoNote>) : FilterValidator<VideoNote>(
    VideoNote::class, validator)

